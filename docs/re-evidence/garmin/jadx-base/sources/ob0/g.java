package ob0;

import bt1.o;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d53.k;
import e23.l;
import e23.p;
import f72.oe;
import gg1.o0;
import gl1.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.weight.WeightScreenKt$WeightRoute$1$1", f = "WeightScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Double, Unit> f131125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<pb0.a> f131126b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Double, Unit> lVar, x3<pb0.a> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f131125a = lVar;
            this.f131126b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f131125a, this.f131126b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f131125a.invoke(new Double(this.f131126b.getF182175a().f136828a));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final h hVar, l<? super Double, Unit> lVar, l<? super o0, Unit> lVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        hVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-534903947);
        int i15 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(hVar.f131128b, o0VarE);
            p1 p1VarC2 = s9.c.c(hVar.f131130d, o0VarE);
            p1 p1VarC3 = s9.c.c(hVar.f131133g, o0VarE);
            pb0.a aVar3 = (pb0.a) p1VarC.getF182175a();
            boolean zB = ((i15 & 112) == 32) | o0VarE.B(p1VarC);
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (zB) {
                objQ = new a(lVar, p1VarC, null);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(lVar, p1VarC, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, aVar3, o0VarE);
            o0 o0Var = (o0) p1VarC2.getF182175a();
            ob0.a aVar5 = (ob0.a) p1VarC3.getF182175a();
            boolean z14 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new na0.l(lVar2, 19);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new na0.l(lVar2, 19);
                    o0VarE.K(objQ2);
                }
            }
            l lVar3 = (l) objQ2;
            boolean zR = o0VarE.r(hVar);
            Object objQ3 = o0VarE.q();
            if (zR) {
                objQ3 = new l() { // from class: ob0.f
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        Object value;
                        Object value2;
                        String string;
                        Object value3;
                        a aVar6;
                        switch (i16) {
                            case 0:
                                Boolean bool = (Boolean) obj;
                                boolean zBooleanValue = bool.booleanValue();
                                h hVar2 = hVar;
                                p2 p2Var = hVar2.f131134h;
                                do {
                                    value = p2Var.getValue();
                                    ((Boolean) value).getClass();
                                } while (!p2Var.b(value, bool));
                                if (zBooleanValue) {
                                    p2 p2Var2 = hVar2.f131132f;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, a.a((a) value2, null, false, false, 3)));
                                } else {
                                    hVar2.y4();
                                }
                                break;
                            default:
                                x5.l0 l0VarA = (x5.l0) obj;
                                l0VarA.getClass();
                                h hVar3 = hVar;
                                hVar3.getClass();
                                c cVar = (c) hVar3.f131131e.getValue();
                                s5.c cVar2 = l0VarA.f188878a;
                                String str = cVar2.f157138b;
                                cVar.getClass();
                                str.getClass();
                                if (new k("\\D").d(str)) {
                                    string = "";
                                } else if (new k("0+").d(str)) {
                                    string = "0";
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    int length = str.length();
                                    boolean z15 = false;
                                    for (int i18 = 0; i18 < length; i18++) {
                                        char cCharAt = str.charAt(i18);
                                        if (Character.isDigit(cCharAt)) {
                                            sb3.append(cCharAt);
                                        } else if (cCharAt == cVar.f131104a && !z15 && sb3.length() > 0) {
                                            sb3.append(cCharAt);
                                            z15 = true;
                                        }
                                    }
                                    string = sb3.toString();
                                }
                                if (!string.equals(cVar2.f157138b)) {
                                    l0VarA = x5.l0.a(l0VarA, string, 0L, 6);
                                }
                                x5.l0 l0Var = l0VarA;
                                p2 p2Var3 = hVar3.f131132f;
                                do {
                                    value3 = p2Var3.getValue();
                                    aVar6 = (a) value3;
                                } while (!p2Var3.b(value3, a.a(aVar6, l0Var, aVar6.f131102c ? true : aVar6.f131101b, false, 4)));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new l() { // from class: ob0.f
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            Object value;
                            Object value2;
                            String string;
                            Object value3;
                            a aVar6;
                            switch (i16) {
                                case 0:
                                    Boolean bool = (Boolean) obj;
                                    boolean zBooleanValue = bool.booleanValue();
                                    h hVar2 = hVar;
                                    p2 p2Var = hVar2.f131134h;
                                    do {
                                        value = p2Var.getValue();
                                        ((Boolean) value).getClass();
                                    } while (!p2Var.b(value, bool));
                                    if (zBooleanValue) {
                                        p2 p2Var2 = hVar2.f131132f;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, a.a((a) value2, null, false, false, 3)));
                                    } else {
                                        hVar2.y4();
                                    }
                                    break;
                                default:
                                    x5.l0 l0VarA = (x5.l0) obj;
                                    l0VarA.getClass();
                                    h hVar3 = hVar;
                                    hVar3.getClass();
                                    c cVar = (c) hVar3.f131131e.getValue();
                                    s5.c cVar2 = l0VarA.f188878a;
                                    String str = cVar2.f157138b;
                                    cVar.getClass();
                                    str.getClass();
                                    if (new k("\\D").d(str)) {
                                        string = "";
                                    } else if (new k("0+").d(str)) {
                                        string = "0";
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        int length = str.length();
                                        boolean z15 = false;
                                        for (int i18 = 0; i18 < length; i18++) {
                                            char cCharAt = str.charAt(i18);
                                            if (Character.isDigit(cCharAt)) {
                                                sb3.append(cCharAt);
                                            } else if (cCharAt == cVar.f131104a && !z15 && sb3.length() > 0) {
                                                sb3.append(cCharAt);
                                                z15 = true;
                                            }
                                        }
                                        string = sb3.toString();
                                    }
                                    if (!string.equals(cVar2.f157138b)) {
                                        l0VarA = x5.l0.a(l0VarA, string, 0L, 6);
                                    }
                                    x5.l0 l0Var = l0VarA;
                                    p2 p2Var3 = hVar3.f131132f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        aVar6 = (a) value3;
                                    } while (!p2Var3.b(value3, a.a(aVar6, l0Var, aVar6.f131102c ? true : aVar6.f131101b, false, 4)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
            }
            l lVar4 = (l) objQ3;
            boolean zR2 = o0VarE.r(hVar);
            Object objQ4 = o0VarE.q();
            if (zR2) {
                objQ4 = new l() { // from class: ob0.f
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        Object value;
                        Object value2;
                        String string;
                        Object value3;
                        a aVar6;
                        switch (i17) {
                            case 0:
                                Boolean bool = (Boolean) obj;
                                boolean zBooleanValue = bool.booleanValue();
                                h hVar2 = hVar;
                                p2 p2Var = hVar2.f131134h;
                                do {
                                    value = p2Var.getValue();
                                    ((Boolean) value).getClass();
                                } while (!p2Var.b(value, bool));
                                if (zBooleanValue) {
                                    p2 p2Var2 = hVar2.f131132f;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, a.a((a) value2, null, false, false, 3)));
                                } else {
                                    hVar2.y4();
                                }
                                break;
                            default:
                                x5.l0 l0VarA = (x5.l0) obj;
                                l0VarA.getClass();
                                h hVar3 = hVar;
                                hVar3.getClass();
                                c cVar = (c) hVar3.f131131e.getValue();
                                s5.c cVar2 = l0VarA.f188878a;
                                String str = cVar2.f157138b;
                                cVar.getClass();
                                str.getClass();
                                if (new k("\\D").d(str)) {
                                    string = "";
                                } else if (new k("0+").d(str)) {
                                    string = "0";
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    int length = str.length();
                                    boolean z15 = false;
                                    for (int i18 = 0; i18 < length; i18++) {
                                        char cCharAt = str.charAt(i18);
                                        if (Character.isDigit(cCharAt)) {
                                            sb3.append(cCharAt);
                                        } else if (cCharAt == cVar.f131104a && !z15 && sb3.length() > 0) {
                                            sb3.append(cCharAt);
                                            z15 = true;
                                        }
                                    }
                                    string = sb3.toString();
                                }
                                if (!string.equals(cVar2.f157138b)) {
                                    l0VarA = x5.l0.a(l0VarA, string, 0L, 6);
                                }
                                x5.l0 l0Var = l0VarA;
                                p2 p2Var3 = hVar3.f131132f;
                                do {
                                    value3 = p2Var3.getValue();
                                    aVar6 = (a) value3;
                                } while (!p2Var3.b(value3, a.a(aVar6, l0Var, aVar6.f131102c ? true : aVar6.f131101b, false, 4)));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            } else {
                aVar4.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new l() { // from class: ob0.f
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            Object value;
                            Object value2;
                            String string;
                            Object value3;
                            a aVar6;
                            switch (i17) {
                                case 0:
                                    Boolean bool = (Boolean) obj;
                                    boolean zBooleanValue = bool.booleanValue();
                                    h hVar2 = hVar;
                                    p2 p2Var = hVar2.f131134h;
                                    do {
                                        value = p2Var.getValue();
                                        ((Boolean) value).getClass();
                                    } while (!p2Var.b(value, bool));
                                    if (zBooleanValue) {
                                        p2 p2Var2 = hVar2.f131132f;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, a.a((a) value2, null, false, false, 3)));
                                    } else {
                                        hVar2.y4();
                                    }
                                    break;
                                default:
                                    x5.l0 l0VarA = (x5.l0) obj;
                                    l0VarA.getClass();
                                    h hVar3 = hVar;
                                    hVar3.getClass();
                                    c cVar = (c) hVar3.f131131e.getValue();
                                    s5.c cVar2 = l0VarA.f188878a;
                                    String str = cVar2.f157138b;
                                    cVar.getClass();
                                    str.getClass();
                                    if (new k("\\D").d(str)) {
                                        string = "";
                                    } else if (new k("0+").d(str)) {
                                        string = "0";
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        int length = str.length();
                                        boolean z15 = false;
                                        for (int i18 = 0; i18 < length; i18++) {
                                            char cCharAt = str.charAt(i18);
                                            if (Character.isDigit(cCharAt)) {
                                                sb3.append(cCharAt);
                                            } else if (cCharAt == cVar.f131104a && !z15 && sb3.length() > 0) {
                                                sb3.append(cCharAt);
                                                z15 = true;
                                            }
                                        }
                                        string = sb3.toString();
                                    }
                                    if (!string.equals(cVar2.f157138b)) {
                                        l0VarA = x5.l0.a(l0VarA, string, 0L, 6);
                                    }
                                    x5.l0 l0Var = l0VarA;
                                    p2 p2Var3 = hVar3.f131132f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        aVar6 = (a) value3;
                                    } while (!p2Var3.b(value3, a.a(aVar6, l0Var, aVar6.f131102c ? true : aVar6.f131101b, false, 4)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                }
            }
            l lVar5 = (l) objQ4;
            boolean zR3 = o0VarE.r(hVar);
            Object objQ5 = o0VarE.q();
            if (zR3) {
                objQ5 = new n82.i(hVar, 17);
                o0VarE.K(objQ5);
            } else {
                aVar4.getClass();
                if (objQ5 == m.a.f135155b) {
                    objQ5 = new n82.i(hVar, 17);
                    o0VarE.K(objQ5);
                }
            }
            b(o0Var, aVar5, lVar3, lVar4, lVar5, (e23.a) objQ5, aVar, aVar2, o0VarE, 33030144 & (i15 << 9));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e((Object) hVar, (Object) lVar, (Object) lVar2, (Object) aVar, (Object) aVar2, i14, 0);
        }
    }

    public static final void b(o0 o0Var, ob0.a aVar, l<? super o0, Unit> lVar, l<? super Boolean, Unit> lVar2, l<? super x5.l0, Unit> lVar3, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, m mVar, int i14) {
        int i15;
        p3.o0 o0Var2;
        p3.o0 o0VarE = mVar.E(-92792902);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(o0Var.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.common_bic_weight_title);
            String strQ2 = y.Q(o0VarE, R.string.msg_profile_info_privacy);
            s62.a.f157643a.getClass();
            u4.d dVarA = oe.a(t62.c.f162799a);
            String strQ3 = y.Q(o0VarE, R.string.lbl_next);
            boolean z14 = aVar.f131101b;
            h4.d.f81522a.getClass();
            o0Var2 = o0VarE;
            da0.p.b("user_profile_weight_screen", strQ, dVarA, strQ2, null, strQ3, aVar3, z14, null, null, false, null, null, false, false, aVar4, null, null, null, null, h4.d.a.f81537o, z3.f.c(-1552231750, new ak0.h(aVar, o0Var, lVar, lVar2, aVar2, lVar3, 18), o0VarE), o0Var2, (3670016 & i16) | 6, (i16 >> 6) & 458752, 432, 2064144);
        } else {
            o0Var2 = o0VarE;
            o0Var2.e();
        }
        p3.p2 p2VarI0 = o0Var2.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(o0Var, aVar, lVar, lVar2, lVar3, aVar2, aVar3, aVar4, i14);
        }
    }
}
