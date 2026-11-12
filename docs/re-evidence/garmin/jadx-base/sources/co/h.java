package co;

import am.x0;
import am.z0;
import android.content.Context;
import bo.m;
import bo.n;
import bo.o;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import java.util.Iterator;
import java.util.List;
import ns.v;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import ps.o1;
import ps.q;
import ps.u0;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lco/h;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lfm/a;", "activityStatsTextProvider", "<init>", "(Landroid/content/Context;Lfm/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fm.a f28110b;

    public h(Context context, fm.a aVar) {
        context.getClass();
        aVar.getClass();
        this.f28109a = context;
        this.f28110b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:133:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:147:0x0204  */
    /* JADX WARN: Code duplicated, block: B:149:0x0208  */
    /* JADX WARN: Code duplicated, block: B:150:0x020b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0211  */
    /* JADX WARN: Code duplicated, block: B:154:0x0218  */
    /* JADX WARN: Code duplicated, block: B:157:0x021e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0223  */
    /* JADX WARN: Code duplicated, block: B:161:0x0229  */
    /* JADX WARN: Code duplicated, block: B:162:0x0230  */
    /* JADX WARN: Code duplicated, block: B:165:0x0236  */
    /* JADX WARN: Code duplicated, block: B:166:0x023d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0243  */
    /* JADX WARN: Code duplicated, block: B:170:0x024a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0250  */
    /* JADX WARN: Code duplicated, block: B:174:0x025c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0266  */
    /* JADX WARN: Code duplicated, block: B:178:0x026d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0271  */
    /* JADX WARN: Code duplicated, block: B:181:0x0278  */
    /* JADX WARN: Code duplicated, block: B:183:0x027c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0283  */
    /* JADX WARN: Code duplicated, block: B:189:0x0292  */
    /* JADX WARN: Code duplicated, block: B:194:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:204:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:207:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:208:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:212:0x02cf A[PHI: r3
      0x02cf: PHI (r3v61 java.lang.Integer) = (r3v17 java.lang.Integer), (r3v63 java.lang.Integer) binds: [B:218:0x02e5, B:211:0x02cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:213:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:217:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:220:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:226:0x02f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:232:0x0307  */
    /* JADX WARN: Code duplicated, block: B:235:0x0312  */
    /* JADX WARN: Code duplicated, block: B:238:0x0318  */
    /* JADX WARN: Code duplicated, block: B:239:0x031f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0325  */
    /* JADX WARN: Code duplicated, block: B:243:0x032c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0332  */
    /* JADX WARN: Code duplicated, block: B:247:0x0339  */
    /* JADX WARN: Code duplicated, block: B:249:0x033d  */
    /* JADX WARN: Code duplicated, block: B:253:0x0345 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x0347  */
    /* JADX WARN: Code duplicated, block: B:260:0x035a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0361  */
    /* JADX WARN: Code duplicated, block: B:264:0x0367  */
    /* JADX WARN: Code duplicated, block: B:267:0x0371  */
    /* JADX WARN: Code duplicated, block: B:268:0x0378  */
    /* JADX WARN: Code duplicated, block: B:271:0x0382  */
    /* JADX WARN: Code duplicated, block: B:272:0x038e  */
    /* JADX WARN: Code duplicated, block: B:275:0x0394  */
    /* JADX WARN: Code duplicated, block: B:276:0x039b  */
    /* JADX WARN: Code duplicated, block: B:279:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:280:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:282:0x03ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:283:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:284:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:285:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:287:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:289:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:291:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:293:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:294:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:297:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:299:0x040b  */
    /* JADX WARN: Code duplicated, block: B:300:0x0415  */
    /* JADX WARN: Code duplicated, block: B:302:0x041f  */
    /* JADX WARN: Code duplicated, block: B:305:0x0431  */
    /* JADX WARN: Code duplicated, block: B:306:0x043d  */
    /* JADX WARN: Code duplicated, block: B:309:0x0443  */
    /* JADX WARN: Code duplicated, block: B:310:0x044f  */
    /* JADX WARN: Code duplicated, block: B:312:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:315:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:316:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:318:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:321:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:323:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:324:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:326:0x0501  */
    /* JADX WARN: Code duplicated, block: B:327:0x0506  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:330:0x0510  */
    /* JADX WARN: Code duplicated, block: B:333:0x0520  */
    /* JADX WARN: Code duplicated, block: B:335:0x0524  */
    /* JADX WARN: Code duplicated, block: B:339:0x0536  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:342:0x05df  */
    /* JADX WARN: Code duplicated, block: B:345:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:347:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:352:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0114  */
    public final wo0.a a(bo.l lVar) {
        bo.j jVar;
        bo.j jVar2;
        bo.j jVar3;
        String str;
        double dDoubleValue;
        Double d14;
        double dDoubleValue2;
        String str2;
        v vVar;
        Integer num;
        Double dValueOf;
        Double dValueOf2;
        Double d15;
        double dDoubleValue3;
        Double d16;
        Boolean bool;
        boolean zBooleanValue;
        Double d17;
        double dDoubleValue4;
        Integer num2;
        int iIntValue;
        Double d18;
        double dDoubleValue5;
        Double d19;
        double dDoubleValue6;
        Double d24;
        double dDoubleValue7;
        Double d25;
        double dDoubleValue8;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        double dDoubleValue9;
        String str3;
        Double d26;
        double dDoubleValue10;
        Integer num3;
        int iIntValue5;
        bo.j jVar4;
        double d27;
        Integer num4;
        double dIntValue;
        double dDoubleValue11;
        Double d28;
        double dDoubleValue12;
        Double d29;
        double dDoubleValue13;
        Double d34;
        double dDoubleValue14;
        String str4;
        bo.j jVar5;
        Double d35;
        double dDoubleValue15;
        Long l14;
        long jLongValue;
        Long l15;
        Integer numValueOf;
        Double d36;
        double dDoubleValue16;
        Double d37;
        double dDoubleValue17;
        bo.j jVar6;
        o1 o1Var;
        Double d38;
        int iIntValue6;
        Double d39;
        Double d44;
        Double dValueOf3;
        Double dValueOf4;
        aq.c cVar;
        String string;
        CharSequence charSequence;
        CharSequence charSequence2;
        Integer num5;
        Integer num6;
        Integer num7;
        Double d45;
        Double dValueOf5;
        Double d46;
        bo.h hVar;
        u0 u0Var;
        Integer num8;
        Double dValueOf6;
        Integer num9;
        Double dValueOf7;
        Long l16;
        Integer numValueOf2;
        Integer num10;
        Double d47;
        Double d48;
        bo.j jVar7;
        bo.h hVar2;
        Double d49;
        Integer num11;
        Long l17;
        Float f14;
        List<n> list;
        Object next;
        Double d54;
        Object next2;
        Object next3;
        Object next4;
        lVar.getClass();
        Double dValueOf8 = Double.valueOf(Double.NaN);
        Integer num12 = lVar.f19184m0;
        Double d55 = lVar.f19187o;
        o oVar = lVar.f19168e0;
        List<bo.j> list2 = lVar.f19204w0;
        bo.e eVar = lVar.f19167e;
        String string2 = null;
        x0 x0VarL = z0.l(x0.f4346x, eVar != null ? eVar.f19107b : null);
        x xVarF = tq.k.f(x0VarL);
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it.next();
            } while (!s.g(((bo.j) next4).f19131e, xVarF != null ? xVarF.f147220a : null));
            jVar = (bo.j) next4;
        } else {
            jVar = null;
        }
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!s.g(((bo.j) next3).f19131e, x.CLIMB_ACTIVE.f147220a));
            jVar2 = (bo.j) next3;
            if (jVar2 == null) {
                if (list2 != null) {
                    jVar2 = (bo.j) h0.d0(list2);
                } else {
                    jVar2 = null;
                }
            }
        } else if (list2 != null) {
            jVar2 = (bo.j) h0.d0(list2);
        } else {
            jVar2 = null;
        }
        if (list2 != null) {
            Iterator<T> it4 = list2.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!s.g(((bo.j) next2).f19131e, x.DIVE_SECTION.f147220a));
            jVar3 = (bo.j) next2;
        } else {
            jVar3 = null;
        }
        Long l18 = lVar.f19159a;
        long jLongValue2 = l18 != null ? l18.longValue() : 0L;
        String str5 = lVar.f19161b;
        int iN = z0.n(x0VarL);
        if (eVar == null || (str = eVar.f19107b) == null) {
            str = x0.f4346x.f4358a;
        }
        String str6 = lVar.f19201v;
        String str7 = lVar.f19163c;
        Double d56 = lVar.f19181l;
        double dDoubleValue18 = d56 != null ? d56.doubleValue() : 0.0d;
        Double d57 = lVar.f19191q;
        double dDoubleValue19 = d57 != null ? d57.doubleValue() : 0.0d;
        if (jVar == null || (d54 = jVar.f19129c) == null) {
            dDoubleValue = d55 != null ? d55.doubleValue() : 0.0d;
        } else {
            dDoubleValue = d54.doubleValue();
        }
        int i14 = m.f19212a[x0VarL.ordinal()];
        if (i14 == 1 || i14 == 2) {
            if (jVar2 == null || (d14 = jVar2.f19129c) == null) {
                dDoubleValue2 = 0.0d;
            } else {
                dDoubleValue2 = d14.doubleValue();
            }
        } else if (d55 != null) {
            dDoubleValue2 = d55.doubleValue();
        } else {
            dDoubleValue2 = 0.0d;
        }
        Double d58 = lVar.f19189p;
        double dDoubleValue20 = d58 != null ? d58.doubleValue() : 0.0d;
        Double d59 = lVar.f19205x;
        double dDoubleValue21 = d59 != null ? d59.doubleValue() : 0.0d;
        Double d64 = lVar.I;
        double dDoubleValue22 = d64 != null ? d64.doubleValue() : 0.0d;
        Double d65 = lVar.f19203w;
        Double d66 = lVar.L;
        double dDoubleValue23 = d66 != null ? d66.doubleValue() : 0.0d;
        Double d67 = lVar.f19185n;
        l3.a aVar = l3.f23124b;
        Double d68 = lVar.f19162b0;
        double dDoubleValue24 = d68 != null ? d68.doubleValue() : 0.0d;
        aVar.getClass();
        double dB = l3.a.b((float) dDoubleValue24);
        if (oVar != null && (list = oVar.f19227i) != null) {
            Iterator<T> it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    str2 = str7;
                    next = null;
                    break;
                }
                next = it5.next();
                str2 = str7;
                Integer num13 = ((n) next).f19215c;
                if (num13 != null && num13.intValue() == 0) {
                    break;
                }
                str7 = str2;
            }
            n nVar = (n) next;
            if (nVar != null) {
                Integer num14 = nVar.f19214b;
                Integer numValueOf3 = Integer.valueOf(num14 != null ? num14.intValue() : 0);
                Integer num15 = nVar.f19213a;
                vVar = new v(numValueOf3, Integer.valueOf(num15 != null ? num15.intValue() : 0));
            }
            if (oVar != null) {
                num = oVar.f19225g;
            } else {
                num = null;
            }
            if (oVar != null || (f14 = oVar.f19226h) == null) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(f14.floatValue());
            }
            if (oVar != null || (l17 = oVar.f19228j) == null) {
                dValueOf2 = null;
            } else {
                dValueOf2 = Double.valueOf(l17.longValue());
            }
            d15 = lVar.f19172g0;
            if (d15 != null) {
                dDoubleValue3 = d15.doubleValue();
            } else {
                dDoubleValue3 = 0.0d;
            }
            if (jVar3 != null) {
                d16 = jVar3.f19152z;
            } else {
                d16 = null;
            }
            bool = lVar.f19166d0;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            d17 = lVar.f19207y;
            if (d17 != null) {
                dDoubleValue4 = d17.doubleValue();
            } else {
                dDoubleValue4 = 0.0d;
            }
            num2 = lVar.f19174h0;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            d18 = lVar.f19179k;
            if (d18 != null) {
                dDoubleValue5 = d18.doubleValue();
            } else {
                dDoubleValue5 = 0.0d;
            }
            d19 = lVar.f19193r;
            if (d19 != null) {
                dDoubleValue6 = d19.doubleValue();
            } else {
                dDoubleValue6 = 0.0d;
            }
            d24 = lVar.O0;
            if (d24 != null) {
                dDoubleValue7 = d24.doubleValue();
            } else {
                dDoubleValue7 = 0.0d;
            }
            int i15 = (int) dDoubleValue7;
            d25 = lVar.f19192q0;
            if (d25 != null) {
                dDoubleValue8 = d25.doubleValue();
            } else {
                dDoubleValue8 = 0.0d;
            }
            if (num12 != null) {
                iIntValue2 = num12.intValue();
            } else {
                iIntValue2 = 0;
            }
            if (num12 != null) {
                iIntValue3 = num12.intValue();
            } else {
                iIntValue3 = 0;
            }
            if (jVar2 != null || (num11 = jVar2.f19127a) == null) {
                iIntValue4 = 0;
            } else {
                iIntValue4 = num11.intValue();
            }
            if (jVar2 != null || (d49 = jVar2.f19130d) == null) {
                dDoubleValue9 = 0.0d;
            } else {
                dDoubleValue9 = d49.doubleValue();
            }
            if (list2 != null || (jVar7 = (bo.j) h0.d0(list2)) == null || (hVar2 = jVar7.f19128b) == null || (str3 = hVar2.f19121b) == null) {
                str3 = "";
            }
            String str8 = str3;
            d26 = lVar.B;
            if (d26 != null) {
                dDoubleValue10 = d26.doubleValue();
            } else {
                dDoubleValue10 = 0.0d;
            }
            if (jVar != null || (num3 = jVar.f19127a) == null) {
                if (list2 != null || (jVar4 = (bo.j) h0.d0(list2)) == null) {
                    num3 = null;
                } else {
                    num3 = jVar4.f19127a;
                }
                if (num3 != null) {
                    iIntValue5 = num3.intValue();
                } else {
                    iIntValue5 = 0;
                }
            } else {
                iIntValue5 = num3.intValue();
            }
            if (jVar != null || (d48 = jVar.f19136j) == null) {
                if (jVar != null || (num4 = jVar.f19135i) == null) {
                    d27 = 0.0d;
                } else {
                    dIntValue = num4.intValue();
                }
                if (jVar != null || (d47 = jVar.f19139m) == null) {
                    dDoubleValue11 = 0.0d;
                } else {
                    dDoubleValue11 = d47.doubleValue();
                }
                d28 = lVar.f19194r0;
                if (d28 != null) {
                    dDoubleValue12 = d28.doubleValue();
                } else {
                    dDoubleValue12 = 0.0d;
                }
                d29 = lVar.f19202v0;
                if (d29 != null) {
                    dDoubleValue13 = d29.doubleValue();
                } else {
                    dDoubleValue13 = 0.0d;
                }
                d34 = lVar.f19200u0;
                if (d34 != null) {
                    dDoubleValue14 = d34.doubleValue();
                } else {
                    dDoubleValue14 = 0.0d;
                }
                if (jVar == null && (str = jVar.f19140n) != null) {
                    str4 = str;
                } else if (list2 != null || (jVar5 = (bo.j) h0.d0(list2)) == null) {
                    str4 = null;
                } else {
                    String str9 = jVar5.f19140n;
                    str4 = str9;
                }
                String str10 = lVar.N0;
                d35 = lVar.f19195s;
                if (d35 != null) {
                    dDoubleValue15 = d35.doubleValue();
                } else {
                    dDoubleValue15 = 0.0d;
                }
                Double d69 = lVar.f19197t;
                double dDoubleValue25 = d69 != null ? d69.doubleValue() : 0.0d;
                l14 = lVar.f19199u;
                if (l14 != null) {
                    jLongValue = l14.longValue();
                } else {
                    jLongValue = 0;
                }
                l15 = lVar.E;
                if (l15 != null) {
                    numValueOf = Integer.valueOf((int) l15.longValue());
                } else {
                    numValueOf = null;
                }
                d36 = lVar.f19209z;
                if (d36 != null) {
                    dDoubleValue16 = d36.doubleValue();
                } else {
                    dDoubleValue16 = Double.NaN;
                }
                d37 = lVar.A;
                if (d37 != null) {
                    dDoubleValue17 = d37.doubleValue();
                } else {
                    dDoubleValue17 = Double.NaN;
                }
                if (jVar != null) {
                    jVar6 = jVar;
                } else if (list2 != null) {
                    jVar6 = (bo.j) h0.d0(list2);
                } else {
                    jVar6 = null;
                }
                if (jVar6 != null) {
                    d45 = jVar6.f19137k;
                    dValueOf5 = jVar6.f19136j;
                    if (dValueOf5 == null) {
                        num10 = jVar6.f19135i;
                        if (num10 != null) {
                            dValueOf5 = Double.valueOf(num10.intValue());
                        } else {
                            d45 = d45;
                            d46 = null;
                        }
                        Double d74 = jVar6.f19130d;
                        Double d75 = jVar6.f19152z;
                        Double d76 = jVar6.f19129c;
                        Double d77 = jVar6.f19149w;
                        Double d78 = jVar6.f19138l;
                        Double d79 = jVar6.f19139m;
                        Integer num16 = jVar6.f19127a;
                        String str11 = jVar6.f19131e;
                        hVar = jVar6.f19128b;
                        if (hVar != null) {
                            String str12 = hVar.f19122c;
                            l16 = hVar.f19120a;
                            if (l16 != null) {
                                numValueOf2 = Integer.valueOf((int) l16.longValue());
                            } else {
                                numValueOf2 = null;
                            }
                            u0Var = new u0(str12, numValueOf2, hVar.f19121b);
                        } else {
                            u0Var = null;
                        }
                        Integer num17 = jVar6.f19141o;
                        Integer num18 = jVar6.f19132f;
                        String str13 = jVar6.f19140n;
                        num8 = jVar6.f19150x;
                        if (num8 != null) {
                            dValueOf6 = Double.valueOf(num8.intValue());
                        } else {
                            dValueOf6 = null;
                        }
                        num9 = jVar6.f19151y;
                        if (num9 != null) {
                            dValueOf7 = Double.valueOf(num9.intValue());
                        } else {
                            dValueOf7 = null;
                        }
                        o1Var = new o1(d45, d46, d74, null, d75, d76, d77, d78, null, d79, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVar6.f19133g, jVar6.f19134h, num16, str11, null, u0Var, null, num17, null, num18, null, null, null, null, null, null, null, str13, null, null, null, null, null, null, null, null, null, null, null, dValueOf6, dValueOf7, -760, -2108145, 1, null);
                    }
                    d46 = dValueOf5;
                    Double d710 = jVar6.f19130d;
                    Double d711 = jVar6.f19152z;
                    Double d712 = jVar6.f19129c;
                    Double d713 = jVar6.f19149w;
                    Double d714 = jVar6.f19138l;
                    Double d715 = jVar6.f19139m;
                    Integer num19 = jVar6.f19127a;
                    String str14 = jVar6.f19131e;
                    hVar = jVar6.f19128b;
                    if (hVar != null) {
                        String str15 = hVar.f19122c;
                        l16 = hVar.f19120a;
                        if (l16 != null) {
                            numValueOf2 = Integer.valueOf((int) l16.longValue());
                        } else {
                            numValueOf2 = null;
                        }
                        u0Var = new u0(str15, numValueOf2, hVar.f19121b);
                    } else {
                        u0Var = null;
                    }
                    Integer num110 = jVar6.f19141o;
                    Integer num111 = jVar6.f19132f;
                    String str16 = jVar6.f19140n;
                    num8 = jVar6.f19150x;
                    if (num8 != null) {
                        dValueOf6 = Double.valueOf(num8.intValue());
                    } else {
                        dValueOf6 = null;
                    }
                    num9 = jVar6.f19151y;
                    if (num9 != null) {
                        dValueOf7 = Double.valueOf(num9.intValue());
                    } else {
                        dValueOf7 = null;
                    }
                    o1Var = new o1(d45, d46, d710, null, d711, d712, d713, d714, null, d715, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVar6.f19133g, jVar6.f19134h, num19, str14, null, u0Var, null, num110, null, num111, null, null, null, null, null, null, null, str16, null, null, null, null, null, null, null, null, null, null, null, dValueOf6, dValueOf7, -760, -2108145, 1, null);
                } else {
                    d67 = d67;
                    dValueOf = dValueOf;
                    str5 = str5;
                    o1Var = null;
                }
                Integer num20 = lVar.f19186n0;
                if (jVar != null) {
                    d38 = jVar.f19139m;
                } else {
                    d38 = null;
                }
                if (jVar != null || (num7 = jVar.f19127a) == null) {
                    iIntValue6 = 0;
                } else {
                    iIntValue6 = num7.intValue();
                }
                if (jVar != null) {
                    d39 = jVar.f19137k;
                } else {
                    d39 = null;
                }
                if (jVar != null) {
                    d44 = jVar.f19149w;
                } else {
                    d44 = null;
                }
                Double d84 = lVar.D0;
                Integer num21 = lVar.f19170f0;
                Double d85 = lVar.A0;
                if (jVar != null || (num6 = jVar.f19150x) == null) {
                    dValueOf3 = null;
                } else {
                    dValueOf3 = Double.valueOf(num6.intValue());
                }
                if (jVar != null || (num5 = jVar.f19151y) == null) {
                    dValueOf4 = null;
                } else {
                    dValueOf4 = Double.valueOf(num5.intValue());
                }
                q qVar = new q(jLongValue2, str5, iN, str, str6, str2, 0, null, null, 0.0d, dDoubleValue18, dDoubleValue19, dDoubleValue, dDoubleValue2, dDoubleValue20, dDoubleValue21, dDoubleValue22, d65, null, dDoubleValue23, null, d67, dB, vVar, num, dValueOf, dValueOf2, dDoubleValue3, null, d16, zBooleanValue, dDoubleValue4, iIntValue, 0L, dDoubleValue5, dDoubleValue6, i15, 0.0d, dDoubleValue8, iIntValue2, iIntValue3, iIntValue4, dDoubleValue9, str8, dDoubleValue10, iIntValue5, d27, dDoubleValue11, "", 0, 0, 0, "", dDoubleValue12, dDoubleValue13, dDoubleValue14, null, str4, str10, dDoubleValue15, dDoubleValue25, null, null, jLongValue, null, null, -1L, numValueOf, Double.NaN, dDoubleValue16, dDoubleValue17, null, null, null, o1Var, num20, null, null, d38, iIntValue6, d39, d44, d84, num21, d85, dValueOf3, dValueOf4, null, null, dValueOf8, dValueOf8, dValueOf8, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 1610612736, 896, null);
                cVar = (aq.c) h0.d0(this.f28110b.a(this.f28109a, qVar, new fm.d()));
                long activityId = qVar.getActivityId();
                String activityName = qVar.getActivityName();
                double duration = qVar.getDuration();
                String startTimeLocal = qVar.getStartTimeLocal();
                String str17 = lVar.f19165d;
                x0 x0VarO = qVar.o();
                if (cVar != null || (charSequence2 = cVar.f11849c) == null) {
                    string = null;
                } else {
                    string = charSequence2.toString();
                }
                if (cVar != null && (charSequence = cVar.f11850d) != null) {
                    string2 = charSequence.toString();
                }
                String str18 = string2;
                Boolean bool2 = lVar.f19173h;
                return new wo0.a(activityId, activityName, duration, startTimeLocal, str17, x0VarO, string, str18, bool2 != null ? bool2.booleanValue() : false);
            }
            dIntValue = d48.doubleValue();
            d27 = dIntValue;
            if (jVar != null) {
                dDoubleValue11 = 0.0d;
            } else {
                dDoubleValue11 = 0.0d;
            }
            d28 = lVar.f19194r0;
            if (d28 != null) {
                dDoubleValue12 = d28.doubleValue();
            } else {
                dDoubleValue12 = 0.0d;
            }
            d29 = lVar.f19202v0;
            if (d29 != null) {
                dDoubleValue13 = d29.doubleValue();
            } else {
                dDoubleValue13 = 0.0d;
            }
            d34 = lVar.f19200u0;
            if (d34 != null) {
                dDoubleValue14 = d34.doubleValue();
            } else {
                dDoubleValue14 = 0.0d;
            }
            if (jVar == null) {
                if (list2 != null) {
                }
                str4 = null;
            } else {
                if (list2 != null) {
                }
                str4 = null;
            }
            String str19 = lVar.N0;
            d35 = lVar.f19195s;
            if (d35 != null) {
                dDoubleValue15 = d35.doubleValue();
            } else {
                dDoubleValue15 = 0.0d;
            }
            Double d610 = lVar.f19197t;
            double dDoubleValue26 = d610 != null ? d610.doubleValue() : 0.0d;
            l14 = lVar.f19199u;
            if (l14 != null) {
                jLongValue = l14.longValue();
            } else {
                jLongValue = 0;
            }
            l15 = lVar.E;
            if (l15 != null) {
                numValueOf = Integer.valueOf((int) l15.longValue());
            } else {
                numValueOf = null;
            }
            d36 = lVar.f19209z;
            if (d36 != null) {
                dDoubleValue16 = d36.doubleValue();
            } else {
                dDoubleValue16 = Double.NaN;
            }
            d37 = lVar.A;
            if (d37 != null) {
                dDoubleValue17 = d37.doubleValue();
            } else {
                dDoubleValue17 = Double.NaN;
            }
            if (jVar != null) {
                jVar6 = jVar;
            } else if (list2 != null) {
                jVar6 = (bo.j) h0.d0(list2);
            } else {
                jVar6 = null;
            }
            if (jVar6 != null) {
                d45 = jVar6.f19137k;
                dValueOf5 = jVar6.f19136j;
                if (dValueOf5 == null) {
                    num10 = jVar6.f19135i;
                    if (num10 != null) {
                        dValueOf5 = Double.valueOf(num10.intValue());
                    } else {
                        d45 = d45;
                        d46 = null;
                    }
                    Double d716 = jVar6.f19130d;
                    Double d717 = jVar6.f19152z;
                    Double d718 = jVar6.f19129c;
                    Double d719 = jVar6.f19149w;
                    Double d7110 = jVar6.f19138l;
                    Double d7111 = jVar6.f19139m;
                    Integer num112 = jVar6.f19127a;
                    String str110 = jVar6.f19131e;
                    hVar = jVar6.f19128b;
                    if (hVar != null) {
                        String str111 = hVar.f19122c;
                        l16 = hVar.f19120a;
                        if (l16 != null) {
                            numValueOf2 = Integer.valueOf((int) l16.longValue());
                        } else {
                            numValueOf2 = null;
                        }
                        u0Var = new u0(str111, numValueOf2, hVar.f19121b);
                    } else {
                        u0Var = null;
                    }
                    Integer num113 = jVar6.f19141o;
                    Integer num114 = jVar6.f19132f;
                    String str112 = jVar6.f19140n;
                    num8 = jVar6.f19150x;
                    if (num8 != null) {
                        dValueOf6 = Double.valueOf(num8.intValue());
                    } else {
                        dValueOf6 = null;
                    }
                    num9 = jVar6.f19151y;
                    if (num9 != null) {
                        dValueOf7 = Double.valueOf(num9.intValue());
                    } else {
                        dValueOf7 = null;
                    }
                    o1Var = new o1(d45, d46, d716, null, d717, d718, d719, d7110, null, d7111, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVar6.f19133g, jVar6.f19134h, num112, str110, null, u0Var, null, num113, null, num114, null, null, null, null, null, null, null, str112, null, null, null, null, null, null, null, null, null, null, null, dValueOf6, dValueOf7, -760, -2108145, 1, null);
                }
                d46 = dValueOf5;
                Double d7112 = jVar6.f19130d;
                Double d7113 = jVar6.f19152z;
                Double d7114 = jVar6.f19129c;
                Double d7115 = jVar6.f19149w;
                Double d7116 = jVar6.f19138l;
                Double d7117 = jVar6.f19139m;
                Integer num115 = jVar6.f19127a;
                String str113 = jVar6.f19131e;
                hVar = jVar6.f19128b;
                if (hVar != null) {
                    String str114 = hVar.f19122c;
                    l16 = hVar.f19120a;
                    if (l16 != null) {
                        numValueOf2 = Integer.valueOf((int) l16.longValue());
                    } else {
                        numValueOf2 = null;
                    }
                    u0Var = new u0(str114, numValueOf2, hVar.f19121b);
                } else {
                    u0Var = null;
                }
                Integer num116 = jVar6.f19141o;
                Integer num117 = jVar6.f19132f;
                String str115 = jVar6.f19140n;
                num8 = jVar6.f19150x;
                if (num8 != null) {
                    dValueOf6 = Double.valueOf(num8.intValue());
                } else {
                    dValueOf6 = null;
                }
                num9 = jVar6.f19151y;
                if (num9 != null) {
                    dValueOf7 = Double.valueOf(num9.intValue());
                } else {
                    dValueOf7 = null;
                }
                o1Var = new o1(d45, d46, d7112, null, d7113, d7114, d7115, d7116, null, d7117, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVar6.f19133g, jVar6.f19134h, num115, str113, null, u0Var, null, num116, null, num117, null, null, null, null, null, null, null, str115, null, null, null, null, null, null, null, null, null, null, null, dValueOf6, dValueOf7, -760, -2108145, 1, null);
            } else {
                d67 = d67;
                dValueOf = dValueOf;
                str5 = str5;
                o1Var = null;
            }
            Integer num22 = lVar.f19186n0;
            if (jVar != null) {
                d38 = jVar.f19139m;
            } else {
                d38 = null;
            }
            if (jVar != null) {
                iIntValue6 = 0;
            } else {
                iIntValue6 = 0;
            }
            if (jVar != null) {
                d39 = jVar.f19137k;
            } else {
                d39 = null;
            }
            if (jVar != null) {
                d44 = jVar.f19149w;
            } else {
                d44 = null;
            }
            Double d86 = lVar.D0;
            Integer num23 = lVar.f19170f0;
            Double d87 = lVar.A0;
            if (jVar != null) {
                dValueOf3 = null;
            } else {
                dValueOf3 = null;
            }
            if (jVar != null) {
                dValueOf4 = null;
            } else {
                dValueOf4 = null;
            }
            q qVar2 = new q(jLongValue2, str5, iN, str, str6, str2, 0, null, null, 0.0d, dDoubleValue18, dDoubleValue19, dDoubleValue, dDoubleValue2, dDoubleValue20, dDoubleValue21, dDoubleValue22, d65, null, dDoubleValue23, null, d67, dB, vVar, num, dValueOf, dValueOf2, dDoubleValue3, null, d16, zBooleanValue, dDoubleValue4, iIntValue, 0L, dDoubleValue5, dDoubleValue6, i15, 0.0d, dDoubleValue8, iIntValue2, iIntValue3, iIntValue4, dDoubleValue9, str8, dDoubleValue10, iIntValue5, d27, dDoubleValue11, "", 0, 0, 0, "", dDoubleValue12, dDoubleValue13, dDoubleValue14, null, str4, str19, dDoubleValue15, dDoubleValue26, null, null, jLongValue, null, null, -1L, numValueOf, Double.NaN, dDoubleValue16, dDoubleValue17, null, null, null, o1Var, num22, null, null, d38, iIntValue6, d39, d44, d86, num23, d87, dValueOf3, dValueOf4, null, null, dValueOf8, dValueOf8, dValueOf8, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 1610612736, 896, null);
            cVar = (aq.c) h0.d0(this.f28110b.a(this.f28109a, qVar2, new fm.d()));
            long activityId2 = qVar2.getActivityId();
            String activityName2 = qVar2.getActivityName();
            double duration2 = qVar2.getDuration();
            String startTimeLocal2 = qVar2.getStartTimeLocal();
            String str116 = lVar.f19165d;
            x0 x0VarO2 = qVar2.o();
            if (cVar != null) {
                string = null;
            } else {
                string = null;
            }
            if (cVar != null) {
                string2 = charSequence.toString();
            }
            String str117 = string2;
            Boolean bool3 = lVar.f19173h;
            return new wo0.a(activityId2, activityName2, duration2, startTimeLocal2, str116, x0VarO2, string, str117, bool3 != null ? bool3.booleanValue() : false);
        }
        str2 = str7;
        vVar = null;
        if (oVar != null) {
            num = oVar.f19225g;
        } else {
            num = null;
        }
        if (oVar != null) {
            dValueOf = null;
        } else {
            dValueOf = null;
        }
        if (oVar != null) {
            dValueOf2 = null;
        } else {
            dValueOf2 = null;
        }
        d15 = lVar.f19172g0;
        if (d15 != null) {
            dDoubleValue3 = d15.doubleValue();
        } else {
            dDoubleValue3 = 0.0d;
        }
        if (jVar3 != null) {
            d16 = jVar3.f19152z;
        } else {
            d16 = null;
        }
        bool = lVar.f19166d0;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        d17 = lVar.f19207y;
        if (d17 != null) {
            dDoubleValue4 = d17.doubleValue();
        } else {
            dDoubleValue4 = 0.0d;
        }
        num2 = lVar.f19174h0;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        d18 = lVar.f19179k;
        if (d18 != null) {
            dDoubleValue5 = d18.doubleValue();
        } else {
            dDoubleValue5 = 0.0d;
        }
        d19 = lVar.f19193r;
        if (d19 != null) {
            dDoubleValue6 = d19.doubleValue();
        } else {
            dDoubleValue6 = 0.0d;
        }
        d24 = lVar.O0;
        if (d24 != null) {
            dDoubleValue7 = d24.doubleValue();
        } else {
            dDoubleValue7 = 0.0d;
        }
        int i16 = (int) dDoubleValue7;
        d25 = lVar.f19192q0;
        if (d25 != null) {
            dDoubleValue8 = d25.doubleValue();
        } else {
            dDoubleValue8 = 0.0d;
        }
        if (num12 != null) {
            iIntValue2 = num12.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (num12 != null) {
            iIntValue3 = num12.intValue();
        } else {
            iIntValue3 = 0;
        }
        if (jVar2 != null) {
            iIntValue4 = 0;
        } else {
            iIntValue4 = 0;
        }
        if (jVar2 != null) {
            dDoubleValue9 = 0.0d;
        } else {
            dDoubleValue9 = 0.0d;
        }
        if (list2 != null) {
            str3 = "";
        } else {
            str3 = "";
        }
        String str20 = str3;
        d26 = lVar.B;
        if (d26 != null) {
            dDoubleValue10 = d26.doubleValue();
        } else {
            dDoubleValue10 = 0.0d;
        }
        if (jVar != null) {
            if (list2 != null) {
                num3 = null;
            } else {
                num3 = null;
            }
            if (num3 != null) {
                iIntValue5 = num3.intValue();
            } else {
                iIntValue5 = 0;
            }
        } else {
            if (list2 != null) {
                num3 = null;
            } else {
                num3 = null;
            }
            if (num3 != null) {
                iIntValue5 = num3.intValue();
            } else {
                iIntValue5 = 0;
            }
        }
        if (jVar != null) {
            if (jVar != null) {
            }
            d27 = 0.0d;
        } else {
            if (jVar != null) {
            }
            d27 = 0.0d;
        }
        if (jVar != null) {
            dDoubleValue11 = 0.0d;
        } else {
            dDoubleValue11 = 0.0d;
        }
        d28 = lVar.f19194r0;
        if (d28 != null) {
            dDoubleValue12 = d28.doubleValue();
        } else {
            dDoubleValue12 = 0.0d;
        }
        d29 = lVar.f19202v0;
        if (d29 != null) {
            dDoubleValue13 = d29.doubleValue();
        } else {
            dDoubleValue13 = 0.0d;
        }
        d34 = lVar.f19200u0;
        if (d34 != null) {
            dDoubleValue14 = d34.doubleValue();
        } else {
            dDoubleValue14 = 0.0d;
        }
        if (jVar == null) {
            if (list2 != null) {
            }
            str4 = null;
        } else {
            if (list2 != null) {
            }
            str4 = null;
        }
        String str118 = lVar.N0;
        d35 = lVar.f19195s;
        if (d35 != null) {
            dDoubleValue15 = d35.doubleValue();
        } else {
            dDoubleValue15 = 0.0d;
        }
        Double d611 = lVar.f19197t;
        double dDoubleValue27 = d611 != null ? d611.doubleValue() : 0.0d;
        l14 = lVar.f19199u;
        if (l14 != null) {
            jLongValue = l14.longValue();
        } else {
            jLongValue = 0;
        }
        l15 = lVar.E;
        if (l15 != null) {
            numValueOf = Integer.valueOf((int) l15.longValue());
        } else {
            numValueOf = null;
        }
        d36 = lVar.f19209z;
        if (d36 != null) {
            dDoubleValue16 = d36.doubleValue();
        } else {
            dDoubleValue16 = Double.NaN;
        }
        d37 = lVar.A;
        if (d37 != null) {
            dDoubleValue17 = d37.doubleValue();
        } else {
            dDoubleValue17 = Double.NaN;
        }
        if (jVar != null) {
            jVar6 = jVar;
        } else if (list2 != null) {
            jVar6 = (bo.j) h0.d0(list2);
        } else {
            jVar6 = null;
        }
        if (jVar6 != null) {
            d45 = jVar6.f19137k;
            dValueOf5 = jVar6.f19136j;
            if (dValueOf5 == null) {
                num10 = jVar6.f19135i;
                if (num10 != null) {
                    dValueOf5 = Double.valueOf(num10.intValue());
                } else {
                    d45 = d45;
                    d46 = null;
                }
                Double d7118 = jVar6.f19130d;
                Double d7119 = jVar6.f19152z;
                Double d71110 = jVar6.f19129c;
                Double d71111 = jVar6.f19149w;
                Double d71112 = jVar6.f19138l;
                Double d71113 = jVar6.f19139m;
                Integer num118 = jVar6.f19127a;
                String str119 = jVar6.f19131e;
                hVar = jVar6.f19128b;
                if (hVar != null) {
                    String str1110 = hVar.f19122c;
                    l16 = hVar.f19120a;
                    if (l16 != null) {
                        numValueOf2 = Integer.valueOf((int) l16.longValue());
                    } else {
                        numValueOf2 = null;
                    }
                    u0Var = new u0(str1110, numValueOf2, hVar.f19121b);
                } else {
                    u0Var = null;
                }
                Integer num119 = jVar6.f19141o;
                Integer num1110 = jVar6.f19132f;
                String str1111 = jVar6.f19140n;
                num8 = jVar6.f19150x;
                if (num8 != null) {
                    dValueOf6 = Double.valueOf(num8.intValue());
                } else {
                    dValueOf6 = null;
                }
                num9 = jVar6.f19151y;
                if (num9 != null) {
                    dValueOf7 = Double.valueOf(num9.intValue());
                } else {
                    dValueOf7 = null;
                }
                o1Var = new o1(d45, d46, d7118, null, d7119, d71110, d71111, d71112, null, d71113, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVar6.f19133g, jVar6.f19134h, num118, str119, null, u0Var, null, num119, null, num1110, null, null, null, null, null, null, null, str1111, null, null, null, null, null, null, null, null, null, null, null, dValueOf6, dValueOf7, -760, -2108145, 1, null);
            }
            d46 = dValueOf5;
            Double d71114 = jVar6.f19130d;
            Double d71115 = jVar6.f19152z;
            Double d71116 = jVar6.f19129c;
            Double d71117 = jVar6.f19149w;
            Double d71118 = jVar6.f19138l;
            Double d71119 = jVar6.f19139m;
            Integer num1111 = jVar6.f19127a;
            String str1112 = jVar6.f19131e;
            hVar = jVar6.f19128b;
            if (hVar != null) {
                String str1113 = hVar.f19122c;
                l16 = hVar.f19120a;
                if (l16 != null) {
                    numValueOf2 = Integer.valueOf((int) l16.longValue());
                } else {
                    numValueOf2 = null;
                }
                u0Var = new u0(str1113, numValueOf2, hVar.f19121b);
            } else {
                u0Var = null;
            }
            Integer num1112 = jVar6.f19141o;
            Integer num1113 = jVar6.f19132f;
            String str1114 = jVar6.f19140n;
            num8 = jVar6.f19150x;
            if (num8 != null) {
                dValueOf6 = Double.valueOf(num8.intValue());
            } else {
                dValueOf6 = null;
            }
            num9 = jVar6.f19151y;
            if (num9 != null) {
                dValueOf7 = Double.valueOf(num9.intValue());
            } else {
                dValueOf7 = null;
            }
            o1Var = new o1(d45, d46, d71114, null, d71115, d71116, d71117, d71118, null, d71119, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVar6.f19133g, jVar6.f19134h, num1111, str1112, null, u0Var, null, num1112, null, num1113, null, null, null, null, null, null, null, str1114, null, null, null, null, null, null, null, null, null, null, null, dValueOf6, dValueOf7, -760, -2108145, 1, null);
        } else {
            d67 = d67;
            dValueOf = dValueOf;
            str5 = str5;
            o1Var = null;
        }
        Integer num24 = lVar.f19186n0;
        if (jVar != null) {
            d38 = jVar.f19139m;
        } else {
            d38 = null;
        }
        if (jVar != null) {
            iIntValue6 = 0;
        } else {
            iIntValue6 = 0;
        }
        if (jVar != null) {
            d39 = jVar.f19137k;
        } else {
            d39 = null;
        }
        if (jVar != null) {
            d44 = jVar.f19149w;
        } else {
            d44 = null;
        }
        Double d88 = lVar.D0;
        Integer num25 = lVar.f19170f0;
        Double d89 = lVar.A0;
        if (jVar != null) {
            dValueOf3 = null;
        } else {
            dValueOf3 = null;
        }
        if (jVar != null) {
            dValueOf4 = null;
        } else {
            dValueOf4 = null;
        }
        q qVar3 = new q(jLongValue2, str5, iN, str, str6, str2, 0, null, null, 0.0d, dDoubleValue18, dDoubleValue19, dDoubleValue, dDoubleValue2, dDoubleValue20, dDoubleValue21, dDoubleValue22, d65, null, dDoubleValue23, null, d67, dB, vVar, num, dValueOf, dValueOf2, dDoubleValue3, null, d16, zBooleanValue, dDoubleValue4, iIntValue, 0L, dDoubleValue5, dDoubleValue6, i16, 0.0d, dDoubleValue8, iIntValue2, iIntValue3, iIntValue4, dDoubleValue9, str20, dDoubleValue10, iIntValue5, d27, dDoubleValue11, "", 0, 0, 0, "", dDoubleValue12, dDoubleValue13, dDoubleValue14, null, str4, str118, dDoubleValue15, dDoubleValue27, null, null, jLongValue, null, null, -1L, numValueOf, Double.NaN, dDoubleValue16, dDoubleValue17, null, null, null, o1Var, num24, null, null, d38, iIntValue6, d39, d44, d88, num25, d89, dValueOf3, dValueOf4, null, null, dValueOf8, dValueOf8, dValueOf8, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 1610612736, 896, null);
        cVar = (aq.c) h0.d0(this.f28110b.a(this.f28109a, qVar3, new fm.d()));
        long activityId3 = qVar3.getActivityId();
        String activityName3 = qVar3.getActivityName();
        double duration3 = qVar3.getDuration();
        String startTimeLocal3 = qVar3.getStartTimeLocal();
        String str1115 = lVar.f19165d;
        x0 x0VarO3 = qVar3.o();
        if (cVar != null) {
            string = null;
        } else {
            string = null;
        }
        if (cVar != null) {
            string2 = charSequence.toString();
        }
        String str1116 = string2;
        Boolean bool4 = lVar.f19173h;
        return new wo0.a(activityId3, activityName3, duration3, startTimeLocal3, str1115, x0VarO3, string, str1116, bool4 != null ? bool4.booleanValue() : false);
    }
}
