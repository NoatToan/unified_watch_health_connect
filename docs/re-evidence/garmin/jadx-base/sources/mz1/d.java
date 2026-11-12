package mz1;

import androidx.lifecycle.v1;
import c22.l3;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121671b;

    public /* synthetic */ d(AddTIEventViewModel addTIEventViewModel, int i14) {
        this.f121670a = i14;
        this.f121671b = addTIEventViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01db  */
    /* JADX WARN: Code duplicated, block: B:109:0x01df  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:113:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:133:0x023f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0254  */
    /* JADX WARN: Code duplicated, block: B:137:0x025b  */
    /* JADX WARN: Code duplicated, block: B:144:0x027b  */
    /* JADX WARN: Code duplicated, block: B:146:0x027f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0283  */
    /* JADX WARN: Code duplicated, block: B:149:0x0287  */
    /* JADX WARN: Code duplicated, block: B:150:0x028b  */
    /* JADX WARN: Code duplicated, block: B:152:0x028f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0293  */
    /* JADX WARN: Code duplicated, block: B:156:0x0299  */
    /* JADX WARN: Code duplicated, block: B:158:0x029d  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:167:0x02be  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:192:0x0316  */
    /* JADX WARN: Code duplicated, block: B:194:0x0326  */
    /* JADX WARN: Code duplicated, block: B:196:0x032a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0338  */
    /* JADX WARN: Code duplicated, block: B:200:0x033d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0349  */
    /* JADX WARN: Code duplicated, block: B:205:0x0357  */
    /* JADX WARN: Code duplicated, block: B:207:0x035f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0364  */
    /* JADX WARN: Code duplicated, block: B:214:0x0376  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Code duplicated, block: B:64:0x012a  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0142  */
    /* JADX WARN: Code duplicated, block: B:69:0x0145  */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0162  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x019b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ba  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        gg0.h hVar;
        String str;
        double d14;
        double dY;
        Double dValueOf;
        double d15;
        int iY;
        Double dValueOf2;
        double d16;
        Double d17;
        String str2;
        fg0.v vVar;
        double dJ;
        fg0.u uVar;
        Double d18;
        fg0.v vVar2;
        fg0.u uVar2;
        Double d19;
        Double d24;
        fg0.u uVar3;
        Double d25;
        Double d26;
        String[] strArr;
        int i14 = this.f121670a;
        AddTIEventViewModel addTIEventViewModel = this.f121671b;
        switch (i14) {
            case 0:
                xy1.a aVar = (xy1.a) obj;
                String[] strArr2 = AddTIEventViewModel.V2;
                aVar.getClass();
                Double d27 = aVar.f192697d;
                Double d28 = aVar.f192696c;
                androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                my1.d dVar = aVar.f192698e;
                String str3 = aVar.f192695b;
                gg0.f fVar = dVar.f121487d;
                ez1.d dVar2 = dVar.f121489f;
                String str4 = (fVar == null || fVar == gg0.f.f77129e) ? null : fVar.f77147a;
                String str5 = g22.n.d(str3) ? str3 : null;
                String str6 = dVar.f121484a;
                String strValueOf = String.valueOf(str6 != null ? g22.k.v(str6, "MM/dd/yy") : null);
                String str7 = dVar.f121485b;
                String strValueOf2 = String.valueOf(str7 != null ? g22.k.v(str7, "MM/dd/yy") : null);
                AddTIEventViewModel addTIEventViewModel2 = this.f121671b;
                double dJ2 = addTIEventViewModel2.U2;
                double d29 = addTIEventViewModel2.T2;
                double d34 = addTIEventViewModel2.S2;
                double d35 = addTIEventViewModel2.R2;
                bg0.a.b bVar = dVar.f121498o;
                boolean z15 = dVar.f121491h;
                ez1.c cVar = dVar.f121494k;
                ez1.c cVar2 = dVar.f121493j;
                if (p005kotlin.jvm.internal.s.g(addTIEventViewModel2.f204393j, Boolean.TRUE)) {
                    fg0.x xVar = addTIEventViewModel2.f204394k;
                    if ((xVar != null ? xVar.f71368d : null) != null) {
                        og0.a aVar2 = og0.a.f131967a;
                        Integer num = xVar != null ? xVar.f71368d : null;
                        num.getClass();
                        double dIntValue = num.intValue();
                        aVar2.getClass();
                        vVar2 = og0.a.l(dIntValue);
                    } else {
                        z14 = addTIEventViewModel2.f204395l;
                        if (!z14) {
                            uVar3 = addTIEventViewModel2.f204397n;
                            if (uVar3 != null) {
                                d25 = uVar3.f71356h;
                            } else {
                                d25 = null;
                            }
                            if (d25 != null) {
                                og0.a aVar3 = og0.a.f131967a;
                                if (uVar3 != null) {
                                    d26 = uVar3.f71356h;
                                } else {
                                    d26 = null;
                                }
                                d26.getClass();
                                double dDoubleValue = d26.doubleValue();
                                aVar3.getClass();
                                vVar2 = og0.a.l(dDoubleValue);
                            }
                        }
                        if (z14) {
                            uVar = addTIEventViewModel2.f204397n;
                            if (uVar != null) {
                                d18 = uVar.f71357i;
                            } else {
                                d18 = null;
                            }
                            if (d18 != null) {
                                String lowerCase = gg0.h.TIME.toString().toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                uVar2 = addTIEventViewModel2.f204397n;
                                if (uVar2 != null) {
                                    d19 = uVar2.f71357i;
                                } else {
                                    d19 = null;
                                }
                                if (uVar2 != null) {
                                    d24 = uVar2.f71357i;
                                } else {
                                    d24 = null;
                                }
                                vVar2 = new fg0.v(lowerCase, d19, d24);
                            }
                        }
                        if (cVar2.w() == 0) {
                            if (z15) {
                                hVar = gg0.h.DISTANCE;
                            } else {
                                hVar = gg0.h.TIME;
                            }
                            str = hVar.f77161a;
                        } else {
                            if (z15) {
                                hVar = gg0.h.DISTANCE;
                            } else {
                                hVar = gg0.h.TIME;
                            }
                            str = hVar.f77161a;
                        }
                        if (z15) {
                            d14 = 0.0d;
                            if (cVar2 != ez1.g.ZERO_TO_5K) {
                                dJ = 0.0d;
                            } else if (cVar2 == ez1.g.FIVE_K_TO_10K) {
                                dJ = d35;
                            } else if (cVar2 == ez1.g.TEN_K_TO_HALF_MARATHON) {
                                dJ = d34;
                            } else if (cVar2 == ez1.g.HALF_MARATHON_TO_MARATHON) {
                                dJ = d29;
                            } else if (cVar2 == ez1.g.GREATER_THAN_MARATHON) {
                                dJ = dJ2;
                            } else if (cVar2 != ez1.b.UNDER_30_MILES) {
                                dJ = 0.0d;
                            } else if (cVar2 == ez1.b.THIRTY_TO_60_MILES) {
                                l3.f23124b.getClass();
                                dJ = 48280.32d;
                            } else if (cVar2 == ez1.b.SIXTY_TO_80_MILES) {
                                l3.f23124b.getClass();
                                dJ = 96560.64d;
                            } else if (cVar2 == ez1.b.EIGHTY_TO_100_MILES) {
                                l3.f23124b.getClass();
                                dJ = 128747.52d;
                            } else if (cVar2 == ez1.b.MORE_THAN_110_MILES) {
                                l3.f23124b.getClass();
                                dJ = 177027.84d;
                            } else if (cVar2 != ez1.b.CUSTOM) {
                                lz1.f.a aVar4 = lz1.f.f115404a;
                                double d36 = dVar.f121497n;
                                aVar4.getClass();
                                dJ = lz1.f.a.j(bVar, d36);
                            } else {
                                lz1.f.a aVar5 = lz1.f.f115404a;
                                double d37 = dVar.f121497n;
                                aVar5.getClass();
                                dJ = lz1.f.a.j(bVar, d37);
                            }
                            dValueOf = Double.valueOf(dJ);
                        } else {
                            d14 = 0.0d;
                            if (cVar == ez1.h.LESS_THAN_24_HOURS) {
                                dY = 0.0d;
                            } else {
                                l3.f23124b.getClass();
                                dY = l3.a.y(24, 0, 0);
                            }
                            dValueOf = Double.valueOf(dY);
                        }
                        if (z15) {
                            if (cVar2 == ez1.g.ZERO_TO_5K) {
                                dJ2 = d35;
                            } else if (cVar2 == ez1.g.FIVE_K_TO_10K) {
                                dJ2 = d34;
                            } else if (cVar2 == ez1.g.TEN_K_TO_HALF_MARATHON) {
                                dJ2 = d29;
                            } else if (cVar2 != ez1.g.HALF_MARATHON_TO_MARATHON) {
                                if (cVar2 != ez1.g.GREATER_THAN_MARATHON) {
                                    dJ2 = Double.POSITIVE_INFINITY;
                                } else if (cVar2 == ez1.b.UNDER_30_MILES) {
                                    l3.f23124b.getClass();
                                    dJ2 = 48280.32d;
                                } else if (cVar2 == ez1.b.THIRTY_TO_60_MILES) {
                                    l3.f23124b.getClass();
                                    dJ2 = 96560.64d;
                                } else if (cVar2 == ez1.b.SIXTY_TO_80_MILES) {
                                    l3.f23124b.getClass();
                                    dJ2 = 128747.52d;
                                } else if (cVar2 == ez1.b.EIGHTY_TO_100_MILES) {
                                    l3.f23124b.getClass();
                                    dJ2 = 160934.4d;
                                } else if (cVar2 != ez1.b.CUSTOM) {
                                    lz1.f.a aVar6 = lz1.f.f115404a;
                                    double d38 = dVar.f121496m;
                                    aVar6.getClass();
                                    dJ2 = lz1.f.a.j(bVar, d38);
                                } else {
                                    lz1.f.a aVar7 = lz1.f.f115404a;
                                    double d39 = dVar.f121496m;
                                    aVar7.getClass();
                                    dJ2 = lz1.f.a.j(bVar, d39);
                                }
                            }
                            dValueOf2 = Double.valueOf(dJ2);
                        } else {
                            if (cVar == ez1.h.LESS_THAN_24_HOURS) {
                                l3.f23124b.getClass();
                                iY = l3.a.y(24, 0, 0);
                            } else {
                                if (cVar == ez1.h.TWENTY_FOUR_TO_48_HOURS) {
                                    l3.f23124b.getClass();
                                    iY = l3.a.y(48, 0, 0);
                                } else {
                                    d15 = d14;
                                }
                                dValueOf2 = Double.valueOf(d15);
                            }
                            d15 = iY;
                            dValueOf2 = Double.valueOf(d15);
                        }
                        if (dValueOf.doubleValue() > d14) {
                            d16 = d14;
                            if (p005kotlin.jvm.internal.s.c(dValueOf2, d16)) {
                                dValueOf2 = Double.valueOf(Double.POSITIVE_INFINITY);
                            }
                        } else {
                            d16 = d14;
                        }
                        if (p005kotlin.jvm.internal.s.c(dValueOf, d16)) {
                            d17 = dValueOf;
                            str2 = str;
                        } else {
                            d17 = dValueOf;
                            str2 = str;
                        }
                        vVar = new fg0.v(str2, dValueOf2, d17);
                    }
                    vVar = vVar2;
                } else {
                    z14 = addTIEventViewModel2.f204395l;
                    if (!z14) {
                        uVar3 = addTIEventViewModel2.f204397n;
                        if (uVar3 != null) {
                            d25 = uVar3.f71356h;
                        } else {
                            d25 = null;
                        }
                        if (d25 != null) {
                            og0.a aVar8 = og0.a.f131967a;
                            if (uVar3 != null) {
                                d26 = uVar3.f71356h;
                            } else {
                                d26 = null;
                            }
                            d26.getClass();
                            double dDoubleValue2 = d26.doubleValue();
                            aVar8.getClass();
                            vVar2 = og0.a.l(dDoubleValue2);
                        }
                        vVar = vVar2;
                    }
                    if (z14) {
                        uVar = addTIEventViewModel2.f204397n;
                        if (uVar != null) {
                            d18 = uVar.f71357i;
                        } else {
                            d18 = null;
                        }
                        if (d18 != null) {
                            String lowerCase2 = gg0.h.TIME.toString().toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                            uVar2 = addTIEventViewModel2.f204397n;
                            if (uVar2 != null) {
                                d19 = uVar2.f71357i;
                            } else {
                                d19 = null;
                            }
                            if (uVar2 != null) {
                                d24 = uVar2.f71357i;
                            } else {
                                d24 = null;
                            }
                            vVar2 = new fg0.v(lowerCase2, d19, d24);
                            vVar = vVar2;
                        }
                    }
                    if (cVar2.w() == 0 || cVar.w() != 0) {
                        if (z15) {
                            hVar = gg0.h.DISTANCE;
                        } else {
                            hVar = gg0.h.TIME;
                        }
                        str = hVar.f77161a;
                    } else {
                        str = null;
                    }
                    if (z15) {
                        d14 = 0.0d;
                        if (cVar2 != ez1.g.ZERO_TO_5K) {
                            dJ = 0.0d;
                        } else if (cVar2 == ez1.g.FIVE_K_TO_10K) {
                            dJ = d35;
                        } else if (cVar2 == ez1.g.TEN_K_TO_HALF_MARATHON) {
                            dJ = d34;
                        } else if (cVar2 == ez1.g.HALF_MARATHON_TO_MARATHON) {
                            dJ = d29;
                        } else if (cVar2 == ez1.g.GREATER_THAN_MARATHON) {
                            dJ = dJ2;
                        } else if (cVar2 != ez1.b.UNDER_30_MILES) {
                            dJ = 0.0d;
                        } else if (cVar2 == ez1.b.THIRTY_TO_60_MILES) {
                            l3.f23124b.getClass();
                            dJ = 48280.32d;
                        } else if (cVar2 == ez1.b.SIXTY_TO_80_MILES) {
                            l3.f23124b.getClass();
                            dJ = 96560.64d;
                        } else if (cVar2 == ez1.b.EIGHTY_TO_100_MILES) {
                            l3.f23124b.getClass();
                            dJ = 128747.52d;
                        } else if (cVar2 == ez1.b.MORE_THAN_110_MILES) {
                            l3.f23124b.getClass();
                            dJ = 177027.84d;
                        } else if (cVar2 != ez1.b.CUSTOM || cVar2 == ez1.a.CUSTOM) {
                            lz1.f.a aVar9 = lz1.f.f115404a;
                            double d310 = dVar.f121497n;
                            aVar9.getClass();
                            dJ = lz1.f.a.j(bVar, d310);
                        } else if (cVar2 == ez1.a.UNDER_50_KILOMETERS) {
                            dJ = 0.0d;
                        } else if (cVar2 == ez1.a.FIFTY_TO_100_KILOMETERS) {
                            l3.f23124b.getClass();
                            dJ = 50000.0d;
                        } else if (cVar2 == ez1.a.HUNDRED_TO_130_KILOMETERS) {
                            l3.f23124b.getClass();
                            dJ = 100000.0d;
                        } else if (cVar2 == ez1.a.ONE_THIRTY_TO_180_KILOMETERS) {
                            l3.f23124b.getClass();
                            dJ = 130000.0d;
                        } else if (cVar2 == ez1.a.MORE_THAN_180_KILOMETERS) {
                            l3.f23124b.getClass();
                            dJ = 180000.0d;
                        } else {
                            dJ = 0.0d;
                        }
                        dValueOf = Double.valueOf(dJ);
                    } else {
                        d14 = 0.0d;
                        if (cVar == ez1.h.LESS_THAN_24_HOURS && cVar == ez1.h.TWENTY_FOUR_TO_48_HOURS) {
                            l3.f23124b.getClass();
                            dY = l3.a.y(24, 0, 0);
                        } else {
                            dY = 0.0d;
                        }
                        dValueOf = Double.valueOf(dY);
                    }
                    if (z15) {
                        if (cVar2 == ez1.g.ZERO_TO_5K) {
                            dJ2 = d35;
                        } else if (cVar2 == ez1.g.FIVE_K_TO_10K) {
                            dJ2 = d34;
                        } else if (cVar2 == ez1.g.TEN_K_TO_HALF_MARATHON) {
                            dJ2 = d29;
                        } else if (cVar2 != ez1.g.HALF_MARATHON_TO_MARATHON) {
                            if (cVar2 != ez1.g.GREATER_THAN_MARATHON) {
                                dJ2 = Double.POSITIVE_INFINITY;
                            } else if (cVar2 == ez1.b.UNDER_30_MILES) {
                                l3.f23124b.getClass();
                                dJ2 = 48280.32d;
                            } else if (cVar2 == ez1.b.THIRTY_TO_60_MILES) {
                                l3.f23124b.getClass();
                                dJ2 = 96560.64d;
                            } else if (cVar2 == ez1.b.SIXTY_TO_80_MILES) {
                                l3.f23124b.getClass();
                                dJ2 = 128747.52d;
                            } else if (cVar2 == ez1.b.EIGHTY_TO_100_MILES) {
                                l3.f23124b.getClass();
                                dJ2 = 160934.4d;
                            } else if (cVar2 != ez1.b.CUSTOM || cVar2 == ez1.a.CUSTOM) {
                                lz1.f.a aVar10 = lz1.f.f115404a;
                                double d311 = dVar.f121496m;
                                aVar10.getClass();
                                dJ2 = lz1.f.a.j(bVar, d311);
                            } else if (cVar2 == ez1.a.UNDER_50_KILOMETERS) {
                                l3.f23124b.getClass();
                                dJ2 = 50000.0d;
                            } else if (cVar2 == ez1.a.FIFTY_TO_100_KILOMETERS) {
                                l3.f23124b.getClass();
                                dJ2 = 100000.0d;
                            } else if (cVar2 == ez1.a.HUNDRED_TO_130_KILOMETERS) {
                                l3.f23124b.getClass();
                                dJ2 = 130000.0d;
                            } else if (cVar2 == ez1.a.ONE_THIRTY_TO_180_KILOMETERS) {
                                l3.f23124b.getClass();
                                dJ2 = 180000.0d;
                            } else if (cVar2 == ez1.a.MORE_THAN_180_KILOMETERS) {
                                dJ2 = Double.POSITIVE_INFINITY;
                            } else {
                                dJ2 = d14;
                            }
                        }
                        dValueOf2 = Double.valueOf(dJ2);
                    } else {
                        if (cVar == ez1.h.LESS_THAN_24_HOURS) {
                            l3.f23124b.getClass();
                            iY = l3.a.y(24, 0, 0);
                        } else {
                            if (cVar == ez1.h.TWENTY_FOUR_TO_48_HOURS) {
                                l3.f23124b.getClass();
                                iY = l3.a.y(48, 0, 0);
                            } else {
                                d15 = d14;
                            }
                            dValueOf2 = Double.valueOf(d15);
                        }
                        d15 = iY;
                        dValueOf2 = Double.valueOf(d15);
                    }
                    if (dValueOf.doubleValue() > d14) {
                        d16 = d14;
                        if (p005kotlin.jvm.internal.s.c(dValueOf2, d16)) {
                            dValueOf2 = Double.valueOf(Double.POSITIVE_INFINITY);
                        }
                    } else {
                        d16 = d14;
                    }
                    if (p005kotlin.jvm.internal.s.c(dValueOf, d16) || !p005kotlin.jvm.internal.s.c(dValueOf2, d16)) {
                        d17 = dValueOf;
                        str2 = str;
                    } else {
                        dValueOf2 = null;
                        d17 = null;
                        str2 = null;
                    }
                    vVar = new fg0.v(str2, dValueOf2, d17);
                }
                boolean z16 = (d28 == null || d27 == null || dVar2.u1() == null) ? false : true;
                List<gg0.j> list = dVar.f121490g;
                gg0.j.f77174c.getClass();
                if (p005kotlin.jvm.internal.s.g(list, p13.u.i0(gg0.j.values())) || list == null) {
                    strArr = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((gg0.j) it.next()).toString());
                    }
                    strArr = (String[]) arrayList.toArray(new String[0]);
                }
                boolean z17 = dVar.f121488e == ny1.g.VIRTUAL;
                boolean z18 = !z17 && (d28 == null || d27 == null || dVar2.u1() == null);
                og0.a aVar11 = og0.a.f131967a;
                String str8 = dVar.f121484a;
                String str9 = dVar.f121485b;
                aVar11.getClass();
                ge1.b.T(v1.a(addTIEventViewModel2), null, null, new g(y0Var, addTIEventViewModel2, dVar, z16, aVar, str4, str5, strValueOf, strValueOf2, vVar, strArr, og0.a.y(str8, str9, false), z17, z18, null), 3);
                return y0Var;
            case 1:
                String[] strArr3 = AddTIEventViewModel.V2;
                addTIEventViewModel.s5().m(Boolean.valueOf(!addTIEventViewModel.q6((bg0.a.c) obj)));
                return Unit.INSTANCE;
            default:
                gg0.f fVar2 = (gg0.f) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.r.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.r.f46219c;
                fVar2.getClass();
                if (addTIEventViewModel.o5().d() == zf0.a.CREATE_EVENT) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "EventTypeAdded");
                }
                if (fVar2 != gg0.f.f77136l) {
                    addTIEventViewModel.W5().m(null);
                    addTIEventViewModel.k5().m(null);
                }
                addTIEventViewModel.x6(fVar2);
                return Unit.INSTANCE;
        }
    }
}
