package v2;

import android.view.KeyEvent;
import ch.qos.logback.classic.net.SyslogAppender;
import kotlin.m3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/b2;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.l f174891a = new w2.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p006l2.j1 f174892b = new p006l2.j1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2.w1.a f174893c = p006l2.w1.f108857a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p1.n0 f174894d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f174895a;

        static {
            int[] iArr = new int[p006l2.s1.values().length];
            try {
                iArr[p006l2.s1.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p006l2.s1.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p006l2.s1.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p006l2.s1.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p006l2.s1.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p006l2.s1.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p006l2.s1.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p006l2.s1.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p006l2.s1.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[p006l2.s1.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[p006l2.s1.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[p006l2.s1.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[p006l2.s1.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[p006l2.s1.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[p006l2.s1.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[p006l2.s1.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[p006l2.s1.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[p006l2.s1.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[p006l2.s1.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[p006l2.s1.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[p006l2.s1.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[p006l2.s1.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[p006l2.s1.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[p006l2.s1.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[p006l2.s1.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[p006l2.s1.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[p006l2.s1.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[p006l2.s1.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[p006l2.s1.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[p006l2.s1.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[p006l2.s1.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[p006l2.s1.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[p006l2.s1.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[p006l2.s1.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[p006l2.s1.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[p006l2.s1.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[p006l2.s1.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[p006l2.s1.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[p006l2.s1.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[p006l2.s1.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[p006l2.s1.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[p006l2.s1.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[p006l2.s1.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[p006l2.s1.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[p006l2.s1.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[p006l2.s1.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[p006l2.s1.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[p006l2.s1.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[p006l2.s1.CENTER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            f174895a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x0473  */
    /* JADX WARN: Code duplicated, block: B:229:0x049a  */
    /* JADX WARN: Code duplicated, block: B:232:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:234:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:235:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public boolean a(KeyEvent keyEvent, h2 h2Var, g2 g2Var, w2.n nVar, e23.l lVar, m3 m3Var, boolean z14, boolean z15, u1 u1Var) {
        float fIntBitsToFloat;
        boolean z16;
        u2.e eVar;
        k2 k2Var;
        u2.h hVar;
        p3.c2 c2Var;
        n4.d dVarJ0;
        Integer numA;
        long jA = z4.d.a(keyEvent);
        int iB = z4.d.b(keyEvent);
        z4.c.f202307b.getClass();
        boolean zBooleanValue = false;
        if (iB == z4.c.f202308c) {
            p1.n0 n0Var = this.f174894d;
            if (n0Var != null && n0Var.a(jA)) {
                p1.n0 n0Var2 = this.f174894d;
                if (n0Var2 != null) {
                    n0Var2.e(jA);
                }
                return true;
            }
        } else if (z4.d.b(keyEvent) != 0 || gl.b.H(keyEvent)) {
            if (!gl.b.H(keyEvent) || (numA = this.f174892b.a(keyEvent)) == null) {
                p006l2.s1 s1VarA = this.f174893c.a(keyEvent);
                if (s1VarA == null || (s1VarA.f108782a && !z14)) {
                    zBooleanValue = false;
                } else {
                    s5.q0 q0VarC = g2Var.c();
                    f5.c0 c0VarE = g2Var.e();
                    if (c0VarE == null) {
                        fIntBitsToFloat = Float.NaN;
                    } else {
                        if (!c0VarE.isAttached()) {
                            c0VarE = null;
                        }
                        if (c0VarE == null) {
                            fIntBitsToFloat = Float.NaN;
                        } else {
                            f5.c0 c0VarB = g2Var.b();
                            if (c0VarB == null) {
                                dVarJ0 = null;
                            } else {
                                if (!c0VarB.isAttached()) {
                                    c0VarB = null;
                                }
                                if (c0VarB != null) {
                                    dVarJ0 = c0VarB.j0(c0VarE, true);
                                } else {
                                    dVarJ0 = null;
                                }
                            }
                            if (dVarJ0 != null) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (dVarJ0.g() & 4294967295L));
                            } else {
                                fIntBitsToFloat = Float.NaN;
                            }
                        }
                    }
                    w2.d dVar = new w2.d(h2Var, q0VarC, i.f(keyEvent), fIntBitsToFloat, this.f174891a);
                    int i14 = a.f174895a[s1VarA.ordinal()];
                    String str = dVar.f181319j;
                    w2.l lVar2 = dVar.f181314e;
                    switch (i14) {
                        case 1:
                        case 2:
                        case 3:
                            lVar.invoke(s1VarA);
                            Unit unit = Unit.INSTANCE;
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16 && (s1VarA == p006l2.s1.UP || s1VarA == p006l2.s1.DOWN || s1VarA == p006l2.s1.LEFT_CHAR || s1VarA == p006l2.s1.RIGHT_CHAR)) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 4:
                            lVar2.f181360a = Float.NaN;
                            if (str.length() > 0) {
                                if (s5.w0.e(dVar.f181317h)) {
                                    if (dVar.b()) {
                                        dVar.j();
                                    } else {
                                        dVar.g();
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                } else {
                                    boolean zB = dVar.b();
                                    long j8 = dVar.f181317h;
                                    if (zB) {
                                        int iH = s5.w0.h(j8);
                                        dVar.f181317h = og.a.l(iH, iH);
                                    } else {
                                        int iG = s5.w0.g(j8);
                                        dVar.f181317h = og.a.l(iG, iG);
                                    }
                                }
                            }
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 5:
                            lVar2.f181360a = Float.NaN;
                            if (str.length() > 0) {
                                if (s5.w0.e(dVar.f181317h)) {
                                    if (dVar.b()) {
                                        dVar.g();
                                    } else {
                                        dVar.j();
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                } else {
                                    boolean zB2 = dVar.b();
                                    long j14 = dVar.f181317h;
                                    if (zB2) {
                                        int iG2 = s5.w0.g(j14);
                                        dVar.f181317h = og.a.l(iG2, iG2);
                                    } else {
                                        int iH2 = s5.w0.h(j14);
                                        dVar.f181317h = og.a.l(iH2, iH2);
                                    }
                                }
                            }
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 6:
                            if (dVar.b()) {
                                dVar.l();
                            } else {
                                dVar.i();
                            }
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 7:
                            if (dVar.b()) {
                                dVar.i();
                            } else {
                                dVar.l();
                            }
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 8:
                            dVar.k();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 9:
                            dVar.h();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 10:
                            dVar.q();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 11:
                            dVar.e();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 12:
                            dVar.r();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 13:
                            dVar.f();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 14:
                            dVar.p();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 15:
                            dVar.o();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 16:
                            if (dVar.b()) {
                                dVar.p();
                            } else {
                                dVar.o();
                            }
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 17:
                            if (dVar.b()) {
                                dVar.o();
                            } else {
                                dVar.p();
                            }
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 18:
                            dVar.n();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 19:
                            dVar.m();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 20:
                            lVar2.f181360a = Float.NaN;
                            if (str.length() > 0) {
                                long j15 = dVar.f181317h;
                                s5.w0.a aVar = s5.w0.f157315b;
                                int i15 = (int) (j15 & 4294967295L);
                                int iOffsetByCodePoints = -1;
                                if (i15 > 0) {
                                    androidx.emoji2.text.d dVarG = ge1.b.G();
                                    if (dVarG != null) {
                                        int iB2 = dVarG.b(i15 - 1, str);
                                        if (iB2 >= 0) {
                                            iOffsetByCodePoints = iB2;
                                        } else if (i15 > 0) {
                                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i15, -1);
                                        }
                                    } else if (i15 > 0) {
                                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i15, -1);
                                    }
                                }
                                long jA2 = w2.h0.a(iOffsetByCodePoints, i15, dVar.f181310a);
                                int i16 = (int) (jA2 >> 32);
                                k2 k2VarA = w2.b.a(jA2);
                                if (i16 != i15 || !s5.w0.e(dVar.f181317h)) {
                                    dVar.f181317h = og.a.l(i16, i16);
                                }
                                if (k2VarA != null) {
                                    dVar.f181318i = k2VarA;
                                }
                            }
                            dVar.a();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 21:
                            dVar.g();
                            dVar.a();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 22:
                            dVar.l();
                            dVar.a();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 23:
                            dVar.i();
                            dVar.a();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 24:
                            dVar.p();
                            dVar.a();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 25:
                            dVar.o();
                            dVar.a();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 26:
                            if (z15) {
                                zBooleanValue = ((Boolean) u1Var.invoke()).booleanValue();
                            } else {
                                h2.h(h2Var, "\n", null, !i.f(keyEvent), 4);
                                zBooleanValue = true;
                            }
                            Unit unit4 = Unit.INSTANCE;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 27:
                            if (z15) {
                                zBooleanValue = false;
                            } else {
                                h2.h(h2Var, SyslogAppender.DEFAULT_STACKTRACE_PATTERN, null, !i.f(keyEvent), 4);
                                zBooleanValue = true;
                            }
                            Unit unit5 = Unit.INSTANCE;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 28:
                            lVar2.f181360a = Float.NaN;
                            if (str.length() > 0) {
                                dVar.f181317h = og.a.l(0, str.length());
                            }
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 29:
                            if (dVar.b()) {
                                dVar.j();
                            } else {
                                dVar.g();
                            }
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 30:
                            if (dVar.b()) {
                                dVar.g();
                            } else {
                                dVar.j();
                            }
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 31:
                            if (dVar.b()) {
                                dVar.l();
                            } else {
                                dVar.i();
                            }
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 32:
                            if (dVar.b()) {
                                dVar.i();
                            } else {
                                dVar.l();
                            }
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 33:
                            dVar.k();
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 34:
                            dVar.h();
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 35:
                            dVar.p();
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 36:
                            dVar.o();
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 37:
                            if (dVar.b()) {
                                dVar.p();
                            } else {
                                dVar.o();
                            }
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 38:
                            if (dVar.b()) {
                                dVar.o();
                            } else {
                                dVar.p();
                            }
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 39:
                            dVar.q();
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 40:
                            dVar.e();
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 41:
                            dVar.r();
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 42:
                            dVar.f();
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 43:
                            dVar.n();
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 44:
                            dVar.m();
                            dVar.s();
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 45:
                            lVar2.f181360a = Float.NaN;
                            if (str.length() > 0) {
                                long j16 = dVar.f181317h;
                                s5.w0.a aVar2 = s5.w0.f157315b;
                                int i17 = (int) (j16 & 4294967295L);
                                dVar.f181317h = og.a.l(i17, i17);
                            }
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 46:
                            u2.h hVar2 = h2Var.f175039a.f167850e.f167863a;
                            u2.k kVar = hVar2.f167846a;
                            x2.e<x2.d> eVar2 = kVar.f167858a;
                            f4.s<x2.d> sVar = eVar2.f188478b;
                            f4.s<x2.d> sVar2 = eVar2.f188478b;
                            if (!sVar.isEmpty() || ((x2.d) kVar.f167859b.getF182175a()) != null) {
                                kVar.a();
                                if (sVar2.isEmpty()) {
                                    b2.e.c("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
                                }
                                Object objF = p13.d0.F(sVar2);
                                eVar2.f188479c.add((T) objF);
                                x2.d dVar2 = (x2.d) objF;
                                hVar2.f167847b.a().b();
                                u2.d dVar3 = hVar2.f167847b;
                                int i18 = dVar2.f188468a;
                                dVar3.c(i18, dVar2.f188470c.length() + i18, dVar2.f188469b);
                                long j17 = dVar2.f188471d;
                                og2.k.E(dVar3, (int) (j17 >> 32), (int) (j17 & 4294967295L));
                                hVar2.f(hVar2.b(), u2.d.g(hVar2.f167847b, 0L, null, 15), true);
                            }
                            Unit unit6 = Unit.INSTANCE;
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 47:
                            u2.h hVar3 = h2Var.f175039a.f167850e.f167863a;
                            u2.k kVar2 = hVar3.f167846a;
                            x2.e<x2.d> eVar3 = kVar2.f167858a;
                            f4.s<x2.d> sVar3 = eVar3.f188479c;
                            f4.s<x2.d> sVar4 = eVar3.f188479c;
                            if (!sVar3.isEmpty() && ((x2.d) kVar2.f167859b.getF182175a()) == null) {
                                if (sVar4.isEmpty()) {
                                    b2.e.c("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
                                }
                                Object objF2 = p13.d0.F(sVar4);
                                eVar3.f188478b.add((T) objF2);
                                x2.d dVar4 = (x2.d) objF2;
                                hVar3.f167847b.a().b();
                                u2.d dVar5 = hVar3.f167847b;
                                int i19 = dVar4.f188468a;
                                dVar5.c(i19, dVar4.f188469b.length() + i19, dVar4.f188470c);
                                long j18 = dVar4.f188472e;
                                og2.k.E(dVar5, (int) (j18 >> 32), (int) (j18 & 4294967295L));
                                hVar3.f(hVar3.b(), u2.d.g(hVar3.f167847b, 0L, null, 15), true);
                            }
                            Unit unit7 = Unit.INSTANCE;
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 48:
                            Unit unit8 = Unit.INSTANCE;
                            zBooleanValue = true;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        case 49:
                            if (u1.g0.f167499f) {
                                m3Var.show();
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                            Unit unit9 = Unit.INSTANCE;
                            z16 = u1.g0.f167499f;
                            eVar = dVar.f181315f;
                            if (z16) {
                                zBooleanValue = !s5.w0.d(eVar.f167840d, dVar.f181317h);
                            }
                            if (!s5.w0.d(dVar.f181317h, eVar.f167840d)) {
                                h2Var.j(dVar.f181317h);
                            }
                            k2Var = dVar.f181318i;
                            if (k2Var != null) {
                                hVar = h2Var.f175039a;
                                c2Var = h2Var.f175042d;
                                if (!s5.w0.e(hVar.b().f167840d)) {
                                    c2Var.setValue(new j1(dVar.f181316g.f175066a, k2Var));
                                } else {
                                    c2Var.setValue(new j1(k2Var));
                                }
                            }
                            break;
                        default:
                            lc.u0.r();
                            return false;
                    }
                }
            } else {
                String string = new StringBuilder(2).appendCodePoint(numA.intValue()).toString();
                if (z14) {
                    h2.h(h2Var, string, null, !i.f(keyEvent), 4);
                    this.f174891a.f181360a = Float.NaN;
                    zBooleanValue = true;
                }
            }
            if (zBooleanValue) {
                p1.n0 n0Var3 = this.f174894d;
                if (n0Var3 == null) {
                    n0Var3 = new p1.n0(3);
                    this.f174894d = n0Var3;
                }
                n0Var3.d(jA);
            }
            return zBooleanValue;
        }
        return false;
    }

    public boolean b(KeyEvent keyEvent, h2 h2Var, w2.n nVar, m4.q qVar, m3 m3Var) {
        if (!s5.w0.e(h2Var.d().f167840d) && keyEvent.getKeyCode() == 4) {
            int iB = z4.d.b(keyEvent);
            z4.c.f202307b.getClass();
            if (iB == z4.c.f202308c) {
                h2 h2Var2 = nVar.f181365a;
                if (!s5.w0.e(h2Var2.d().f167840d)) {
                    u2.h hVar = h2Var2.f175039a;
                    x2.c cVar = x2.c.MergeIfPossible;
                    hVar.f167847b.a().b();
                    u2.d dVar = hVar.f167847b;
                    int i14 = (int) (dVar.f167833d & 4294967295L);
                    og2.k.E(dVar, i14, i14);
                    u2.h.a(hVar, true, cVar);
                }
                nVar.C(false);
                nVar.D(w2.j0.None);
                return true;
            }
        }
        return false;
    }
}
