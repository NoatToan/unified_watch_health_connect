package tf0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.n9;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import o53.f0;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class r {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:107:0x0215  */
    /* JADX WARN: Code duplicated, block: B:109:0x0219  */
    /* JADX WARN: Code duplicated, block: B:110:0x0233  */
    /* JADX WARN: Code duplicated, block: B:112:0x0237  */
    /* JADX WARN: Code duplicated, block: B:113:0x0251  */
    /* JADX WARN: Code duplicated, block: B:121:0x0297  */
    /* JADX WARN: Code duplicated, block: B:126:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:146:0x032c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116  */
    /* JADX WARN: Code duplicated, block: B:74:0x011a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x0135  */
    /* JADX WARN: Code duplicated, block: B:79:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0140  */
    /* JADX WARN: Code duplicated, block: B:82:0x0143  */
    /* JADX WARN: Code duplicated, block: B:85:0x014c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:95:0x018a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0193  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b1  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z14, LocalDate localDate, final i iVar, h4.r rVar, e23.a aVar, e23.l lVar, z3.e eVar, p3.m mVar, int i14) {
        e23.l lVar2;
        sf0.i iVar2;
        l lVar3;
        l lVar4;
        sf0.i.e eVar2;
        uf0.b bVar;
        String status;
        final int i15;
        iVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1522631871);
        int i16 = (i14 & 6) == 0 ? (o0VarE.h(z14) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(localDate) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(iVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            lVar2 = lVar;
            i16 |= o0VarE.r(lVar2) ? 131072 : 65536;
        } else {
            lVar2 = lVar;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.r(eVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = o0VarE.B(localDate);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = fz0.d.c(localDate).toString();
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = fz0.d.c(localDate).toString();
                    o0VarE.K(objQ);
                }
            }
            final String str = (String) objQ;
            p1 p1VarG = f0.G(iVar.b(str), o0VarE);
            boolean zB2 = o0VarE.B((sf0.i) p1VarG.getF182175a());
            Object objQ2 = o0VarE.q();
            if (zB2) {
                iVar2 = (sf0.i) p1VarG.getF182175a();
                if (iVar2 instanceof sf0.i.d) {
                    lVar4 = new l(false, false, null, null, null, false, 63, null);
                } else if (iVar2 instanceof sf0.i.c) {
                    lVar4 = new l(false, true, null, null, null, false, 61, null);
                } else if (iVar2 instanceof sf0.i.e) {
                    eVar2 = (sf0.i.e) iVar2;
                    bVar = eVar2.f158855a;
                    if (bVar != null) {
                        status = bVar.getStatus();
                    } else {
                        status = null;
                    }
                    if (status != null) {
                        switch (status.hashCode()) {
                            case -1159694117:
                                if (status.equals("SUBMITTED")) {
                                    lVar4 = new l(false, false, Integer.valueOf(R.string.epoch_chart_processing_label), null, null, eVar2.f158856b, 27, null);
                                }
                                break;
                            case -753340193:
                                if (!status.equals("DATE_NOT_ARCHIVED")) {
                                    lVar4 = new l(false, false, Integer.valueOf(R.string.txt_empty_page_no_data), null, null, eVar2.f158856b, 27, null);
                                    break;
                                }
                                break;
                            case 335177931:
                                if (!status.equals("CHECK_BACK_LATER")) {
                                    lVar4 = new l(false, false, Integer.valueOf(R.string.epoch_chart_processing_label), null, null, eVar2.f158856b, 27, null);
                                    break;
                                }
                                break;
                            case 1999386108:
                                if (!status.equals("NO_FILES_FOUND")) {
                                    lVar4 = new l(false, false, Integer.valueOf(R.string.txt_empty_page_no_data), null, null, eVar2.f158856b, 27, null);
                                    break;
                                }
                                break;
                            case 2012901275:
                                if (!status.equals("DENIED")) {
                                    lVar4 = new l(false, false, null, new l.a(R.string.epoch_help_reload_limit_header, R.string.epoch_chart_reload_limit), null, false, 55, null);
                                    break;
                                }
                                break;
                        }
                    }
                    lVar3 = new l(false, false, null, null, null, false, 63, null);
                    lVar4 = lVar3;
                } else if (iVar2 instanceof sf0.i.b) {
                    lVar4 = new l(false, false, null, new l.a(R.string.epoch_unable_reload_chart, R.string.epoch_try_again_msg), null, false, 55, null);
                } else if (iVar2 instanceof sf0.i.f) {
                    lVar4 = new l(false, false, null, null, ((sf0.i.f) iVar2).f158857a, false, 47, null);
                } else if (iVar2 instanceof sf0.i.a) {
                    lVar4 = new l(true, false, null, null, null, ((sf0.i.a) iVar2).f158851a, 30, null);
                } else {
                    lVar3 = new l(false, false, null, null, null, false, 63, null);
                    lVar4 = lVar3;
                }
                objQ2 = p0.n(lVar4);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    iVar2 = (sf0.i) p1VarG.getF182175a();
                    if (iVar2 instanceof sf0.i.d) {
                        lVar4 = new l(false, false, null, null, null, false, 63, null);
                    } else if (iVar2 instanceof sf0.i.c) {
                        lVar4 = new l(false, true, null, null, null, false, 61, null);
                    } else if (iVar2 instanceof sf0.i.e) {
                        eVar2 = (sf0.i.e) iVar2;
                        bVar = eVar2.f158855a;
                        if (bVar != null) {
                            status = bVar.getStatus();
                        } else {
                            status = null;
                        }
                        if (status != null) {
                            switch (status.hashCode()) {
                                case -1159694117:
                                    if (status.equals("SUBMITTED")) {
                                        lVar4 = new l(false, false, Integer.valueOf(R.string.epoch_chart_processing_label), null, null, eVar2.f158856b, 27, null);
                                    }
                                    break;
                                case -753340193:
                                    if (!status.equals("DATE_NOT_ARCHIVED")) {
                                        lVar4 = new l(false, false, Integer.valueOf(R.string.txt_empty_page_no_data), null, null, eVar2.f158856b, 27, null);
                                        break;
                                    }
                                    break;
                                case 335177931:
                                    if (!status.equals("CHECK_BACK_LATER")) {
                                        lVar4 = new l(false, false, Integer.valueOf(R.string.epoch_chart_processing_label), null, null, eVar2.f158856b, 27, null);
                                        break;
                                    }
                                    break;
                                case 1999386108:
                                    if (!status.equals("NO_FILES_FOUND")) {
                                        lVar4 = new l(false, false, Integer.valueOf(R.string.txt_empty_page_no_data), null, null, eVar2.f158856b, 27, null);
                                        break;
                                    }
                                    break;
                                case 2012901275:
                                    if (!status.equals("DENIED")) {
                                        lVar4 = new l(false, false, null, new l.a(R.string.epoch_help_reload_limit_header, R.string.epoch_chart_reload_limit), null, false, 55, null);
                                        break;
                                    }
                                    break;
                            }
                        }
                        lVar3 = new l(false, false, null, null, null, false, 63, null);
                        lVar4 = lVar3;
                    } else if (iVar2 instanceof sf0.i.b) {
                        lVar4 = new l(false, false, null, new l.a(R.string.epoch_unable_reload_chart, R.string.epoch_try_again_msg), null, false, 55, null);
                    } else if (iVar2 instanceof sf0.i.f) {
                        lVar4 = new l(false, false, null, null, ((sf0.i.f) iVar2).f158857a, false, 47, null);
                    } else if (iVar2 instanceof sf0.i.a) {
                        lVar4 = new l(true, false, null, null, null, ((sf0.i.a) iVar2).f158851a, 30, null);
                    } else {
                        lVar3 = new l(false, false, null, null, null, false, 63, null);
                        lVar4 = lVar3;
                    }
                    objQ2 = p0.n(lVar4);
                    o0VarE.K(objQ2);
                }
            }
            p1 p1Var = (p1) objQ2;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(iVar) | o0VarE.B(str);
            Object objQ3 = o0VarE.q();
            if (zR) {
                i15 = 0;
                objQ3 = new e23.l() { // from class: tf0.q
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                ((f.a) obj).getClass();
                                iVar.c(b.f164430a, str);
                                break;
                            default:
                                e eVar3 = (e) obj;
                                eVar3.getClass();
                                iVar.c(eVar3, str);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    i15 = 0;
                    objQ3 = new e23.l() { // from class: tf0.q
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    ((f.a) obj).getClass();
                                    iVar.c(b.f164430a, str);
                                    break;
                                default:
                                    e eVar3 = (e) obj;
                                    eVar3.getClass();
                                    iVar.c(eVar3, str);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                } else {
                    i15 = 0;
                }
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ3, o0VarE, i15);
            l lVar5 = (l) p1Var.getF182175a();
            boolean zB3 = o0VarE.B(p1Var);
            Object objQ4 = o0VarE.q();
            if (zB3) {
                objQ4 = new sk0.n(p1Var, 7);
                o0VarE.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new sk0.n(p1Var, 7);
                    o0VarE.K(objQ4);
                }
            }
            e23.l lVar6 = (e23.l) objQ4;
            boolean zR2 = o0VarE.r(iVar) | o0VarE.B(str);
            Object objQ5 = o0VarE.q();
            if (zR2) {
                final int i18 = 1;
                objQ5 = new e23.l() { // from class: tf0.q
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                ((f.a) obj).getClass();
                                iVar.c(b.f164430a, str);
                                break;
                            default:
                                e eVar3 = (e) obj;
                                eVar3.getClass();
                                iVar.c(eVar3, str);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ5);
            } else {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    final int i19 = 1;
                    objQ5 = new e23.l() { // from class: tf0.q
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    ((f.a) obj).getClass();
                                    iVar.c(b.f164430a, str);
                                    break;
                                default:
                                    e eVar3 = (e) obj;
                                    eVar3.getClass();
                                    iVar.c(eVar3, str);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ5);
                }
            }
            e23.l lVar7 = (e23.l) objQ5;
            boolean zR3 = ((i17 & 57344) == 16384) | o0VarE.r(context) | o0VarE.r(qVarC) | o0VarE.r(iVar) | o0VarE.B(str) | ((458752 & i17) == 131072);
            Object objQ6 = o0VarE.q();
            if (zR3) {
                aa2.p pVar = new aa2.p(context, aVar, lVar2, qVarC, iVar, str);
                o0VarE.K(pVar);
                objQ6 = pVar;
            } else {
                aVar2.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    aa2.p pVar2 = new aa2.p(context, aVar, lVar2, qVarC, iVar, str);
                    o0VarE.K(pVar2);
                    objQ6 = pVar2;
                }
            }
            h.c(z14, lVar5, rVar, lVar6, lVar7, (e23.l) objQ6, z3.f.c(-934537101, new aa2.o(eVar, 13), o0VarE), o0VarE, (i17 & 14) | 1572864 | ((i17 >> 3) & 896));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(z14, localDate, iVar, rVar, aVar, lVar, eVar, i14);
        }
    }
}
