package com.garmin.android.apps.connectmobile.group.details.about.member;

import b21.v4;
import c2.q;
import c2.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import e23.l;
import e23.p;
import f5.z0;
import gl1.y;
import h4.k;
import h5.e0;
import h5.g;
import l72.c1;
import li0.w;
import li0.z;
import o13.r;
import o53.b0;
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
import r53.j;
import v13.i;
import v62.z2;
import vb.h;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivityKt$ManageMemberButtonView$3$1$1", f = "GroupManageMembersActivity.kt", l = {312}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<e, r53.i<Boolean>> f36223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.connections.groups.services.model.b f36224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j<Boolean> f36225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<GroupDTO.c> f36226e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super e, ? extends r53.i<Boolean>> lVar, com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, j<? super Boolean> jVar, p1<GroupDTO.c> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f36223b = lVar;
            this.f36224c = bVar;
            this.f36225d = jVar;
            this.f36226e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f36223b, this.f36224c, this.f36225d, this.f36226e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f36222a;
            if (i14 == 0) {
                r.b(obj);
                r53.i<Boolean> iVarInvoke = this.f36223b.invoke(new e.a(this.f36226e.getF182175a(), this.f36224c));
                this.f36222a = 1;
                if (iVarInvoke.collect(this.f36225d, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.about.member.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivityKt$ManageMemberButtonView$5$1$1", f = "GroupManageMembersActivity.kt", l = {329}, m = "invokeSuspend", v = 2)
    public static final class C0630b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<e, r53.i<Boolean>> f36228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.connections.groups.services.model.b f36229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j<Boolean> f36230d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0630b(l<? super e, ? extends r53.i<Boolean>> lVar, com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, j<? super Boolean> jVar, t13.d<? super C0630b> dVar) {
            super(2, dVar);
            this.f36228b = lVar;
            this.f36229c = bVar;
            this.f36230d = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C0630b(this.f36228b, this.f36229c, this.f36230d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0630b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f36227a;
            if (i14 == 0) {
                r.b(obj);
                r53.i<Boolean> iVarInvoke = this.f36228b.invoke(new e.b(this.f36229c));
                this.f36227a = 1;
                if (iVarInvoke.collect(this.f36230d, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f36231a;

        public c(p1<Boolean> p1Var) {
            this.f36231a = p1Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            this.f36231a.setValue(bool);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36232a;

        static {
            int[] iArr = new int[GroupDTO.c.values().length];
            try {
                iArr[GroupDTO.c.MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupDTO.c.ADMIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36232a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:120:0x0301  */
    /* JADX WARN: Code duplicated, block: B:122:0x0305  */
    /* JADX WARN: Code duplicated, block: B:126:0x0317  */
    /* JADX WARN: Code duplicated, block: B:129:0x031c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0324  */
    /* JADX WARN: Code duplicated, block: B:134:0x034c  */
    /* JADX WARN: Code duplicated, block: B:160:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:165:0x0422  */
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
    public static final void a(final com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, final GroupDTO groupDTO, final l<? super e, ? extends r53.i<Boolean>> lVar, m mVar, final int i14) {
        o0 o0Var;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        String strJ;
        int i15;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z14;
        Object obj4;
        Object obj5;
        boolean z15;
        Object objQ;
        Object obj6;
        p1 p1Var;
        Object objQ2;
        Object obj7;
        int i16;
        String strP;
        String str;
        int i17;
        Object obj8;
        int i18;
        int i19;
        Object objQ3;
        Object obj9;
        Object obj10;
        Object obj11;
        p1 p1Var2;
        Object obj12;
        Object objQ4;
        Object obj13;
        o0 o0VarE = mVar.E(-1192281075);
        int i24 = i14 | ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(groupDTO) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i24 & 1, (i24 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (bVar.getGroupRole() != GroupDTO.c.MEMBER) {
                if (bVar.getGroupRole() == GroupDTO.c.ADMIN) {
                    if (s.g(bVar.getUserProfileId(), groupDTO != null ? groupDTO.f31561d : null)) {
                    }
                    p2VarI0.f135219d = pVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i25 = 1;
                    pVar = new p() { // from class: om0.i
                        @Override // e23.p
                        public final Object invoke(Object obj14, Object obj15) {
                            int i26 = i25;
                            p3.m mVar2 = (p3.m) obj14;
                            ((Integer) obj15).getClass();
                            switch (i26) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.group.details.about.member.b.a(bVar, groupDTO, lVar, mVar2, p0.t(i14 | 1));
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.group.details.about.member.b.a(bVar, groupDTO, lVar, mVar2, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    p2VarI0.f135219d = pVar;
                }
                return;
            }
            Object objQ5 = o0VarE.q();
            m.f135153a.getClass();
            Object obj14 = m.a.f135155b;
            Object obj15 = objQ5;
            if (objQ5 == obj14) {
                Object objJ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objJ);
                obj15 = objJ;
            }
            b0 b0Var = (b0) obj15;
            Object objQ6 = o0VarE.q();
            Object obj16 = objQ6;
            if (objQ6 == obj14) {
                Object objN = p0.n(Boolean.FALSE);
                o0VarE.K(objN);
                obj16 = objN;
            }
            p1 p1Var3 = (p1) obj16;
            Object objQ7 = o0VarE.q();
            Object obj17 = objQ7;
            if (objQ7 == obj14) {
                Object objN2 = p0.n(Boolean.FALSE);
                o0VarE.K(objN2);
                obj17 = objN2;
            }
            p1 p1Var4 = (p1) obj17;
            Object objQ8 = o0VarE.q();
            Object obj18 = objQ8;
            if (objQ8 == obj14) {
                Object objN3 = p0.n(Boolean.FALSE);
                o0VarE.K(objN3);
                obj18 = objN3;
            }
            p1 p1Var5 = (p1) obj18;
            Object objQ9 = o0VarE.q();
            Object obj19 = objQ9;
            if (objQ9 == obj14) {
                Object objN4 = p0.n(null);
                o0VarE.K(objN4);
                obj19 = objN4;
            }
            p1 p1Var6 = (p1) obj19;
            Object objQ10 = o0VarE.q();
            Object obj20 = objQ10;
            if (objQ10 == obj14) {
                Object objN5 = p0.n(Boolean.FALSE);
                o0VarE.K(objN5);
                obj20 = objN5;
            }
            p1 p1Var7 = (p1) obj20;
            Object objQ11 = o0VarE.q();
            Object obj21 = objQ11;
            if (objQ11 == obj14) {
                Object cVar = new c(p1Var4);
                o0VarE.K(cVar);
                obj21 = cVar;
            }
            Object obj22 = (j) obj21;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(aVar, o0VarE);
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
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            GroupDTO.c groupRole = bVar.getGroupRole();
            int i26 = groupRole == null ? -1 : d.f36232a[groupRole.ordinal()];
            if (i26 == 1) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1820697078, R.string.lbl_member, o0VarE, false);
            } else if (i26 != 2) {
                o0VarE.C(607183339);
                o0VarE.g0(false);
                strJ = "";
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1820700021, R.string.lbl_admin, o0VarE, false);
            }
            s62.a.f157643a.getClass();
            u4.d dVarA = z2.a(t62.b.f162798a);
            z3.e eVarC = f.c(-103696707, new w(p1Var4, 19), o0VarE);
            Object objQ12 = o0VarE.q();
            Object obj23 = objQ12;
            if (objQ12 == obj14) {
                Object hVar = new om0.h(p1Var3, 2);
                o0VarE.K(hVar);
                obj23 = hVar;
            }
            z.g(eVarC, dVarA, strJ, null, false, (e23.a) obj23, o0VarE, 196614, 24);
            boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
            Object objQ13 = o0VarE.q();
            Object obj24 = objQ13;
            if (objQ13 == obj14) {
                Object hVar2 = new om0.h(p1Var3, 3);
                o0VarE.K(hVar2);
                obj24 = hVar2;
            }
            i3.u.a(zBooleanValue, (e23.a) obj24, null, 0L, null, null, null, 0L, 0.0f, 0.0f, f.c(232330232, new ku1.l(bVar, p1Var3, p1Var6, p1Var5, p1Var7, 8), o0VarE), o0VarE, 48, 48, 2044);
            o0 o0Var2 = o0VarE;
            o0Var2.g0(true);
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0Var2.C(137529738);
                String strA = c22.p0.a(bVar.getFullName(), bVar.getDisplayName());
                if (strA == null) {
                    strA = "";
                }
                String str2 = groupDTO != null ? groupDTO.f31559b : null;
                String str3 = str2 == null ? "" : str2;
                c1 c1Var = c1.f110940a;
                GroupDTO.c cVar2 = (GroupDTO.c) p1Var6.getF182175a();
                int i27 = cVar2 != null ? d.f36232a[cVar2.ordinal()] : -1;
                if (i27 != 1) {
                    if (i27 != 2) {
                        o0Var2.C(137997681);
                        i16 = 0;
                        o0Var2.g0(false);
                        str = "";
                    } else {
                        i16 = 0;
                        o0Var2.C(974275259);
                        strP = y.P(R.string.msg_change_role_to_admin_warning, new Object[]{strA, str3}, o0Var2);
                        o0Var2.g0(false);
                    }
                    String strQ = y.Q(o0Var2, R.string.lbl_yes);
                    boolean zR = o0Var2.r(b0Var);
                    i15 = i24;
                    if ((i15 & 896) == 256) {
                        i17 = 1;
                    } else {
                        i17 = i16;
                    }
                    int i28 = (zR ? 1 : 0) | i17;
                    if ((i15 & 14) != 4) {
                        if ((i15 & 8) != 0) {
                            obj8 = bVar;
                            if (o0Var2.r(obj8)) {
                            }
                            i19 = i28 | i18 | (o0Var2.r(obj22) ? 1 : 0);
                            objQ3 = o0Var2.q();
                            if (i19 == 0) {
                                obj9 = obj14;
                                if (objQ3 == obj9) {
                                    obj11 = obj9;
                                    obj10 = obj22;
                                    p1Var2 = p1Var5;
                                    obj12 = objQ3;
                                }
                                e23.a<Unit> aVar3 = (e23.a) obj12;
                                obj2 = b0Var;
                                String strQ2 = y.Q(o0Var2, R.string.lbl_no);
                                objQ4 = o0Var2.q();
                                obj13 = objQ4;
                                if (objQ4 == obj11) {
                                    Object hVar3 = new om0.h(p1Var2, i16);
                                    o0Var2.K(hVar3);
                                    obj13 = hVar3;
                                }
                                boolean z16 = i16;
                                obj = obj11;
                                obj3 = obj10;
                                c1Var.a(false, null, str, null, null, strQ, false, false, aVar3, strQ2, (e23.a) obj13, o0Var2, 0, 6, 219);
                                o0Var2.g0(z16);
                                z14 = z16;
                            } else {
                                obj9 = obj14;
                            }
                            obj10 = obj22;
                            obj11 = obj9;
                            p1Var2 = p1Var5;
                            Object jVar = new ck0.j(b0Var, (Object) p1Var2, (Object) lVar, obj8, obj10, (Object) p1Var6, 9);
                            o0Var2.K(jVar);
                            obj12 = jVar;
                            e23.a<Unit> aVar4 = (e23.a) obj12;
                            obj2 = b0Var;
                            String strQ3 = y.Q(o0Var2, R.string.lbl_no);
                            objQ4 = o0Var2.q();
                            obj13 = objQ4;
                            if (objQ4 == obj11) {
                                Object hVar4 = new om0.h(p1Var2, i16);
                                o0Var2.K(hVar4);
                                obj13 = hVar4;
                            }
                            boolean z17 = i16;
                            obj = obj11;
                            obj3 = obj10;
                            c1Var.a(false, null, str, null, null, strQ, false, false, aVar4, strQ3, (e23.a) obj13, o0Var2, 0, 6, 219);
                            o0Var2.g0(z17);
                            z14 = z17;
                        } else {
                            obj8 = bVar;
                        }
                        i18 = i16;
                        i19 = i28 | i18 | (o0Var2.r(obj22) ? 1 : 0);
                        objQ3 = o0Var2.q();
                        if (i19 == 0) {
                            obj9 = obj14;
                            if (objQ3 == obj9) {
                                obj11 = obj9;
                                obj10 = obj22;
                                p1Var2 = p1Var5;
                                obj12 = objQ3;
                            }
                            e23.a<Unit> aVar5 = (e23.a) obj12;
                            obj2 = b0Var;
                            String strQ4 = y.Q(o0Var2, R.string.lbl_no);
                            objQ4 = o0Var2.q();
                            obj13 = objQ4;
                            if (objQ4 == obj11) {
                                Object hVar5 = new om0.h(p1Var2, i16);
                                o0Var2.K(hVar5);
                                obj13 = hVar5;
                            }
                            boolean z18 = i16;
                            obj = obj11;
                            obj3 = obj10;
                            c1Var.a(false, null, str, null, null, strQ, false, false, aVar5, strQ4, (e23.a) obj13, o0Var2, 0, 6, 219);
                            o0Var2.g0(z18);
                            z14 = z18;
                        } else {
                            obj9 = obj14;
                        }
                        obj10 = obj22;
                        obj11 = obj9;
                        p1Var2 = p1Var5;
                        Object jVar2 = new ck0.j(b0Var, (Object) p1Var2, (Object) lVar, obj8, obj10, (Object) p1Var6, 9);
                        o0Var2.K(jVar2);
                        obj12 = jVar2;
                        e23.a<Unit> aVar6 = (e23.a) obj12;
                        obj2 = b0Var;
                        String strQ5 = y.Q(o0Var2, R.string.lbl_no);
                        objQ4 = o0Var2.q();
                        obj13 = objQ4;
                        if (objQ4 == obj11) {
                            Object hVar6 = new om0.h(p1Var2, i16);
                            o0Var2.K(hVar6);
                            obj13 = hVar6;
                        }
                        boolean z19 = i16;
                        obj = obj11;
                        obj3 = obj10;
                        c1Var.a(false, null, str, null, null, strQ, false, false, aVar6, strQ5, (e23.a) obj13, o0Var2, 0, 6, 219);
                        o0Var2.g0(z19);
                        z14 = z19;
                    } else {
                        obj8 = bVar;
                    }
                    i18 = 1;
                    i19 = i28 | i18 | (o0Var2.r(obj22) ? 1 : 0);
                    objQ3 = o0Var2.q();
                    if (i19 == 0) {
                        obj9 = obj14;
                        if (objQ3 == obj9) {
                            obj11 = obj9;
                            obj10 = obj22;
                            p1Var2 = p1Var5;
                            obj12 = objQ3;
                        }
                        e23.a<Unit> aVar7 = (e23.a) obj12;
                        obj2 = b0Var;
                        String strQ6 = y.Q(o0Var2, R.string.lbl_no);
                        objQ4 = o0Var2.q();
                        obj13 = objQ4;
                        if (objQ4 == obj11) {
                            Object hVar7 = new om0.h(p1Var2, i16);
                            o0Var2.K(hVar7);
                            obj13 = hVar7;
                        }
                        boolean z110 = i16;
                        obj = obj11;
                        obj3 = obj10;
                        c1Var.a(false, null, str, null, null, strQ, false, false, aVar7, strQ6, (e23.a) obj13, o0Var2, 0, 6, 219);
                        o0Var2.g0(z110);
                        z14 = z110;
                    } else {
                        obj9 = obj14;
                    }
                    obj10 = obj22;
                    obj11 = obj9;
                    p1Var2 = p1Var5;
                    Object jVar3 = new ck0.j(b0Var, (Object) p1Var2, (Object) lVar, obj8, obj10, (Object) p1Var6, 9);
                    o0Var2.K(jVar3);
                    obj12 = jVar3;
                    e23.a<Unit> aVar8 = (e23.a) obj12;
                    obj2 = b0Var;
                    String strQ7 = y.Q(o0Var2, R.string.lbl_no);
                    objQ4 = o0Var2.q();
                    obj13 = objQ4;
                    if (objQ4 == obj11) {
                        Object hVar8 = new om0.h(p1Var2, i16);
                        o0Var2.K(hVar8);
                        obj13 = hVar8;
                    }
                    boolean z111 = i16;
                    obj = obj11;
                    obj3 = obj10;
                    c1Var.a(false, null, str, null, null, strQ, false, false, aVar8, strQ7, (e23.a) obj13, o0Var2, 0, 6, 219);
                    o0Var2.g0(z111);
                    z14 = z111;
                } else {
                    i16 = 0;
                    o0Var2.C(974279612);
                    strP = y.P(R.string.msg_change_role_to_member_warning, new Object[]{strA, str3}, o0Var2);
                    o0Var2.g0(false);
                }
                str = strP;
                String strQ8 = y.Q(o0Var2, R.string.lbl_yes);
                boolean zR2 = o0Var2.r(b0Var);
                i15 = i24;
                if ((i15 & 896) == 256) {
                    i17 = 1;
                } else {
                    i17 = i16;
                }
                int i29 = (zR2 ? 1 : 0) | i17;
                if ((i15 & 14) != 4) {
                    if ((i15 & 8) != 0) {
                        obj8 = bVar;
                        if (o0Var2.r(obj8)) {
                        }
                        i19 = i29 | i18 | (o0Var2.r(obj22) ? 1 : 0);
                        objQ3 = o0Var2.q();
                        if (i19 == 0) {
                            obj9 = obj14;
                            if (objQ3 == obj9) {
                                obj11 = obj9;
                                obj10 = obj22;
                                p1Var2 = p1Var5;
                                obj12 = objQ3;
                            }
                            e23.a<Unit> aVar9 = (e23.a) obj12;
                            obj2 = b0Var;
                            String strQ9 = y.Q(o0Var2, R.string.lbl_no);
                            objQ4 = o0Var2.q();
                            obj13 = objQ4;
                            if (objQ4 == obj11) {
                                Object hVar9 = new om0.h(p1Var2, i16);
                                o0Var2.K(hVar9);
                                obj13 = hVar9;
                            }
                            boolean z112 = i16;
                            obj = obj11;
                            obj3 = obj10;
                            c1Var.a(false, null, str, null, null, strQ8, false, false, aVar9, strQ9, (e23.a) obj13, o0Var2, 0, 6, 219);
                            o0Var2.g0(z112);
                            z14 = z112;
                        } else {
                            obj9 = obj14;
                        }
                        obj10 = obj22;
                        obj11 = obj9;
                        p1Var2 = p1Var5;
                        Object jVar4 = new ck0.j(b0Var, (Object) p1Var2, (Object) lVar, obj8, obj10, (Object) p1Var6, 9);
                        o0Var2.K(jVar4);
                        obj12 = jVar4;
                        e23.a<Unit> aVar10 = (e23.a) obj12;
                        obj2 = b0Var;
                        String strQ10 = y.Q(o0Var2, R.string.lbl_no);
                        objQ4 = o0Var2.q();
                        obj13 = objQ4;
                        if (objQ4 == obj11) {
                            Object hVar10 = new om0.h(p1Var2, i16);
                            o0Var2.K(hVar10);
                            obj13 = hVar10;
                        }
                        boolean z113 = i16;
                        obj = obj11;
                        obj3 = obj10;
                        c1Var.a(false, null, str, null, null, strQ8, false, false, aVar10, strQ10, (e23.a) obj13, o0Var2, 0, 6, 219);
                        o0Var2.g0(z113);
                        z14 = z113;
                    } else {
                        obj8 = bVar;
                    }
                    i18 = i16;
                    i19 = i29 | i18 | (o0Var2.r(obj22) ? 1 : 0);
                    objQ3 = o0Var2.q();
                    if (i19 == 0) {
                        obj9 = obj14;
                        if (objQ3 == obj9) {
                            obj11 = obj9;
                            obj10 = obj22;
                            p1Var2 = p1Var5;
                            obj12 = objQ3;
                        }
                        e23.a<Unit> aVar11 = (e23.a) obj12;
                        obj2 = b0Var;
                        String strQ11 = y.Q(o0Var2, R.string.lbl_no);
                        objQ4 = o0Var2.q();
                        obj13 = objQ4;
                        if (objQ4 == obj11) {
                            Object hVar11 = new om0.h(p1Var2, i16);
                            o0Var2.K(hVar11);
                            obj13 = hVar11;
                        }
                        boolean z114 = i16;
                        obj = obj11;
                        obj3 = obj10;
                        c1Var.a(false, null, str, null, null, strQ8, false, false, aVar11, strQ11, (e23.a) obj13, o0Var2, 0, 6, 219);
                        o0Var2.g0(z114);
                        z14 = z114;
                    } else {
                        obj9 = obj14;
                    }
                    obj10 = obj22;
                    obj11 = obj9;
                    p1Var2 = p1Var5;
                    Object jVar5 = new ck0.j(b0Var, (Object) p1Var2, (Object) lVar, obj8, obj10, (Object) p1Var6, 9);
                    o0Var2.K(jVar5);
                    obj12 = jVar5;
                    e23.a<Unit> aVar12 = (e23.a) obj12;
                    obj2 = b0Var;
                    String strQ12 = y.Q(o0Var2, R.string.lbl_no);
                    objQ4 = o0Var2.q();
                    obj13 = objQ4;
                    if (objQ4 == obj11) {
                        Object hVar12 = new om0.h(p1Var2, i16);
                        o0Var2.K(hVar12);
                        obj13 = hVar12;
                    }
                    boolean z115 = i16;
                    obj = obj11;
                    obj3 = obj10;
                    c1Var.a(false, null, str, null, null, strQ8, false, false, aVar12, strQ12, (e23.a) obj13, o0Var2, 0, 6, 219);
                    o0Var2.g0(z115);
                    z14 = z115;
                } else {
                    obj8 = bVar;
                }
                i18 = 1;
                i19 = i29 | i18 | (o0Var2.r(obj22) ? 1 : 0);
                objQ3 = o0Var2.q();
                if (i19 == 0) {
                    obj9 = obj14;
                    if (objQ3 == obj9) {
                        obj11 = obj9;
                        obj10 = obj22;
                        p1Var2 = p1Var5;
                        obj12 = objQ3;
                    }
                    e23.a<Unit> aVar13 = (e23.a) obj12;
                    obj2 = b0Var;
                    String strQ13 = y.Q(o0Var2, R.string.lbl_no);
                    objQ4 = o0Var2.q();
                    obj13 = objQ4;
                    if (objQ4 == obj11) {
                        Object hVar13 = new om0.h(p1Var2, i16);
                        o0Var2.K(hVar13);
                        obj13 = hVar13;
                    }
                    boolean z116 = i16;
                    obj = obj11;
                    obj3 = obj10;
                    c1Var.a(false, null, str, null, null, strQ8, false, false, aVar13, strQ13, (e23.a) obj13, o0Var2, 0, 6, 219);
                    o0Var2.g0(z116);
                    z14 = z116;
                } else {
                    obj9 = obj14;
                }
                obj10 = obj22;
                obj11 = obj9;
                p1Var2 = p1Var5;
                Object jVar6 = new ck0.j(b0Var, (Object) p1Var2, (Object) lVar, obj8, obj10, (Object) p1Var6, 9);
                o0Var2.K(jVar6);
                obj12 = jVar6;
                e23.a<Unit> aVar14 = (e23.a) obj12;
                obj2 = b0Var;
                String strQ14 = y.Q(o0Var2, R.string.lbl_no);
                objQ4 = o0Var2.q();
                obj13 = objQ4;
                if (objQ4 == obj11) {
                    Object hVar14 = new om0.h(p1Var2, i16);
                    o0Var2.K(hVar14);
                    obj13 = hVar14;
                }
                boolean z117 = i16;
                obj = obj11;
                obj3 = obj10;
                c1Var.a(false, null, str, null, null, strQ8, false, false, aVar14, strQ14, (e23.a) obj13, o0Var2, 0, 6, 219);
                o0Var2.g0(z117);
                z14 = z117;
            } else {
                i15 = i24;
                obj = obj14;
                obj2 = b0Var;
                obj3 = obj22;
                z14 = false;
                o0Var2.C(138493621);
                o0Var2.g0(false);
            }
            if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                o0Var2.C(138539842);
                c1 c1Var2 = c1.f110940a;
                String strA2 = c22.p0.a(bVar.getFullName(), bVar.getDisplayName());
                String strP2 = y.P(R.string.lbl_gear_remove_item_title, new Object[]{strA2 != null ? strA2 : ""}, o0Var2);
                String strQ15 = y.Q(o0Var2, R.string.lbl_yes);
                Object obj25 = obj2;
                int i30 = i15;
                int i34 = (o0Var2.r(obj25) ? 1 : 0) | ((i30 & 896) == 256 ? 1 : z14);
                if ((i30 & 14) != 4) {
                    obj4 = bVar;
                    boolean z24 = ((i30 & 8) == 0 || !o0Var2.r(obj4)) ? z14 : 1;
                    obj5 = obj3;
                    z15 = (i34 | z24 ? 1 : 0) | (o0Var2.r(obj5) ? 1 : 0);
                    objQ = o0Var2.q();
                    obj6 = obj;
                    if (z15 == 0 || objQ == obj6) {
                        p1Var = p1Var7;
                        Object v4Var = new v4(obj25, p1Var, lVar, obj4, obj5, 25);
                        o0Var2.K(v4Var);
                        objQ = v4Var;
                    } else {
                        p1Var = p1Var7;
                    }
                    e23.a<Unit> aVar15 = (e23.a) objQ;
                    String strQ16 = y.Q(o0Var2, R.string.lbl_no);
                    objQ2 = o0Var2.q();
                    obj7 = objQ2;
                    if (objQ2 == obj6) {
                        Object hVar15 = new om0.h(p1Var, 1);
                        o0Var2.K(hVar15);
                        obj7 = hVar15;
                    }
                    c1Var2.a(false, null, strP2, null, null, strQ15, false, false, aVar15, strQ16, (e23.a) obj7, o0Var2, 0, 6, 219);
                    o0Var2.g0(z14);
                    o0Var = o0Var2;
                } else {
                    obj4 = bVar;
                }
                obj5 = obj3;
                z15 = (i34 | z24 ? 1 : 0) | (o0Var2.r(obj5) ? 1 : 0);
                objQ = o0Var2.q();
                obj6 = obj;
                if (z15 == 0) {
                    p1Var = p1Var7;
                    Object v4Var2 = new v4(obj25, p1Var, lVar, obj4, obj5, 25);
                    o0Var2.K(v4Var2);
                    objQ = v4Var2;
                } else {
                    p1Var = p1Var7;
                    Object v4Var3 = new v4(obj25, p1Var, lVar, obj4, obj5, 25);
                    o0Var2.K(v4Var3);
                    objQ = v4Var3;
                }
                e23.a<Unit> aVar16 = (e23.a) objQ;
                String strQ17 = y.Q(o0Var2, R.string.lbl_no);
                objQ2 = o0Var2.q();
                obj7 = objQ2;
                if (objQ2 == obj6) {
                    Object hVar16 = new om0.h(p1Var, 1);
                    o0Var2.K(hVar16);
                    obj7 = hVar16;
                }
                c1Var2.a(false, null, strP2, null, null, strQ15, false, false, aVar16, strQ17, (e23.a) obj7, o0Var2, 0, 6, 219);
                o0Var2.g0(z14);
                o0Var = o0Var2;
            } else {
                o0Var2.C(139142389);
                o0Var2.g0(z14);
                o0Var = o0Var2;
            }
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i35 = 0;
            pVar = new p() { // from class: om0.i
                @Override // e23.p
                public final Object invoke(Object obj110, Object obj111) {
                    int i210 = i35;
                    p3.m mVar2 = (p3.m) obj110;
                    ((Integer) obj111).getClass();
                    switch (i210) {
                        case 0:
                            com.garmin.android.apps.connectmobile.group.details.about.member.b.a(bVar, groupDTO, lVar, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.group.details.about.member.b.a(bVar, groupDTO, lVar, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
