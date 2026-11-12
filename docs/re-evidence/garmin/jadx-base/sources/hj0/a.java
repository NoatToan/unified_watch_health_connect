package hj0;

import am.t1;
import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import c22.l3;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import f12.l;
import g22.k;
import gj0.d;
import i53.c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.r;
import o4.f0;
import o53.b0;
import o53.i0;
import o53.j0;
import o53.s0;
import o82.g;
import org.joda.time.DateTime;
import org.joda.time.Weeks;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.k0;
import p13.t0;
import p13.x;
import p13.y;
import r1.q2;
import r53.b2;
import r53.p2;
import v13.e;
import v13.i;
import vb.h;
import yi0.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lhj0/a;", "Landroidx/lifecycle/u1;", "Landroid/content/Context;", "applicationContext", "Lui0/b;", "ftpDelegate", "Lxi0/a;", "ftpRepository", "Lf12/l;", "gcmUserSettings", "Lyi0/c;", "initialSelectedFtpSport", "<init>", "(Landroid/content/Context;Lui0/b;Lxi0/a;Lf12/l;Lyi0/c;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f83963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ui0.b f83964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.a f83965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f83966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f83967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f83968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gj0.a f83969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f83970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f83971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u82.a<o82.a, gj0.a> f83972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u82.a<o82.a, d> f83973k;

    /* JADX INFO: renamed from: hj0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lgj0/a;", "<anonymous>", "(Lo82/a;)Lgj0/a;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.ftp.reports.presentation.viewmodel.FtpViewModel$currentFtpPageState$1", f = "FtpViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
    public static final class C1661a extends i implements p<o82.a, t13.d<? super gj0.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83975b;

        public C1661a(t13.d<? super C1661a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C1661a c1661a = a.this.new C1661a(dVar);
            c1661a.f83975b = obj;
            return c1661a;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super gj0.a> dVar) {
            return ((C1661a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0214  */
        /* JADX WARN: Code duplicated, block: B:103:0x0225  */
        /* JADX WARN: Code duplicated, block: B:105:0x0233  */
        /* JADX WARN: Code duplicated, block: B:107:0x023c  */
        /* JADX WARN: Code duplicated, block: B:113:0x024e  */
        /* JADX WARN: Code duplicated, block: B:116:0x0267 A[LOOP:3: B:114:0x0261->B:116:0x0267, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:121:0x02bf  */
        /* JADX WARN: Code duplicated, block: B:124:0x02ca  */
        /* JADX WARN: Code duplicated, block: B:127:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:129:0x02e4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:130:0x02e6  */
        /* JADX WARN: Code duplicated, block: B:131:0x02f5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:132:0x02f7  */
        /* JADX WARN: Code duplicated, block: B:133:0x0306  */
        /* JADX WARN: Code duplicated, block: B:135:0x030a  */
        /* JADX WARN: Code duplicated, block: B:137:0x030e A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:140:0x0320  */
        /* JADX WARN: Code duplicated, block: B:142:0x0325 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:146:0x033a  */
        /* JADX WARN: Code duplicated, block: B:148:0x033e A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:151:0x0355  */
        /* JADX WARN: Code duplicated, block: B:153:0x035b A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:157:0x0370  */
        /* JADX WARN: Code duplicated, block: B:160:0x0376 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:163:0x037d  */
        /* JADX WARN: Code duplicated, block: B:76:0x0184  */
        /* JADX WARN: Code duplicated, block: B:93:0x01db  */
        /* JADX WARN: Code duplicated, block: B:95:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:98:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:99:0x0211  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA;
            Double dValueOf;
            yi0.d dVarA;
            boolean z14;
            String str;
            String string;
            String strA;
            String string2;
            String str2;
            String string3;
            String str3;
            ArrayList arrayList;
            boolean z15;
            Double d14;
            c cVarB;
            Double d15;
            Float f14;
            boolean z16;
            String strF0;
            String strA2;
            String strC1;
            String strA3;
            boolean z17;
            Object objValueOf;
            f fVar;
            ArrayList arrayList2;
            Iterator<Map.Entry<yi0.a, f>> it;
            Object next;
            o82.a aVar = (o82.a) this.f83975b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83974a;
            a aVar3 = a.this;
            boolean z18 = true;
            if (i14 == 0) {
                r.b(obj);
                yi0.c.f197333f.getClass();
                ArrayList arrayListA = yi0.c.a.a();
                xi0.a aVar4 = aVar3.f83965c;
                String strU1 = aVar3.f83966d.U1();
                fz0.c cVarA = fz0.d.a(aVar.f130843a);
                this.f83975b = null;
                this.f83974a = 1;
                objA = aVar4.a(strU1, cVarA, arrayListA, this);
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objA = obj;
            }
            v2 v2Var = (v2) objA;
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching current FTP data!");
                return null;
            }
            fj0.a aVar5 = fj0.a.f71826a;
            List list = (List) ((v2.b) v2Var).f47386a;
            Context context = aVar3.f83963a;
            l lVar = aVar3.f83966d;
            UserSettingsDTO.c.a aVar6 = UserSettingsDTO.c.f43531c;
            String strW = lVar.w();
            aVar6.getClass();
            boolean z19 = UserSettingsDTO.c.a.a(strW) != UserSettingsDTO.c.FEMALE;
            boolean zY = lVar.y();
            aVar5.getClass();
            list.getClass();
            context.getClass();
            w13.c<yi0.c> cVar = yi0.c.f197338k;
            ArrayList arrayList3 = new ArrayList();
            for (yi0.c cVar2 : cVar) {
                Iterator it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!s.g(((o61.h) next).getSport(), cVar2.f197339a));
                o61.h hVar = (o61.h) next;
                o13.p pVar = hVar != null ? new o13.p(cVar2, hVar) : null;
                if (pVar != null) {
                    arrayList3.add(pVar);
                }
            }
            int iA = t0.a(y.r(arrayList3, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Iterator it4 = arrayList3.iterator(); it4.hasNext(); it4 = it4) {
                o13.p pVar2 = (o13.p) it4.next();
                yi0.c cVar3 = (yi0.c) pVar2.f128594a;
                o61.h hVar2 = (o61.h) pVar2.f128595b;
                boolean z24 = hVar2.getWeight() != null ? z18 : false;
                boolean zG = s.g(hVar2.getIsStale(), Boolean.TRUE);
                boolean zG2 = s.g(hVar2.getIsStale(), Boolean.FALSE);
                Double powerToWeight = hVar2.getPowerToWeight();
                if (powerToWeight == null || zf.b.D(powerToWeight) != z18) {
                    dValueOf = null;
                } else {
                    double dDoubleValue = new BigDecimal(powerToWeight.doubleValue()).setScale(2, RoundingMode.HALF_UP).doubleValue();
                    if (dDoubleValue > 6.0d) {
                        dDoubleValue = 6.0d;
                    }
                    dValueOf = Double.valueOf(dDoubleValue);
                }
                Double functionalThresholdPower = hVar2.getFunctionalThresholdPower();
                Double d16 = zf.b.D(functionalThresholdPower) ? functionalThresholdPower : null;
                Double weight = hVar2.getWeight();
                if (zG) {
                    dVarA = null;
                } else {
                    yi0.d.f197344c.getClass();
                    dVarA = yi0.d.a.a(cVar3, z19, weight);
                }
                yi0.a aVarA = dVarA != null ? dVarA.a(dVarA.f197345a == yi0.b.W_PER_KG ? dValueOf : d16, z19) : null;
                if (zG) {
                    z14 = false;
                } else if ((dVarA != null ? dVarA.f197345a : null) == yi0.b.W_PER_KG && z24 && dValueOf != null) {
                    z14 = z18;
                } else {
                    z14 = false;
                }
                boolean z25 = (z14 || zG || d16 == null) ? false : z18;
                if (z14) {
                    string = context.getString(R.string.string_space_string_bracket_pattern, context.getString(cVar3.f197342d), context.getString(R.string.lbl_watt_kg));
                } else if (z25) {
                    string = context.getString(R.string.string_space_string_bracket_pattern, context.getString(cVar3.f197342d), context.getString(R.string.lbl_watts));
                } else {
                    if (arrayList3.size() == 1) {
                        string = context.getString(cVar3.f197342d);
                    } else {
                        str = null;
                    }
                    if (zG2) {
                        strA = fj0.a.a(context, hVar2.getCalendarDate(), qi0.a.RELATIVE_YEAR_MONTH_DAY_WEEKDAY);
                    } else {
                        strA = context.getString(R.string.msg_sport_type_no_ftp_data, context.getString(cVar3.f197342d));
                    }
                    String str4 = strA;
                    str4.getClass();
                    if (z14) {
                        str2 = l3.f23129g.format(dValueOf.doubleValue());
                        arrayList3 = arrayList3;
                        weight = weight;
                    } else {
                        if (z25) {
                            string2 = l3.a.F0(l3.f23124b, context, d16.doubleValue(), false);
                        } else {
                            string2 = context.getString(R.string.no_value);
                        }
                        str2 = string2;
                    }
                    if (aVarA != null) {
                        string3 = context.getString(aVarA.f197324a);
                    } else {
                        if (zG && z24) {
                            str3 = null;
                        } else {
                            string3 = context.getString(R.string.common_watts);
                        }
                        if (dVarA != null) {
                            Map<yi0.a, f> map = dVarA.f197346b;
                            arrayList2 = new ArrayList(map.size());
                            it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry<yi0.a, f> next2 = it.next();
                                j23.r<Double> rVarA = next2.getValue().a(z19);
                                arrayList2.add(new z72.l((float) (((Number) rVarA.c()).doubleValue() - ((Number) rVarA.getStart()).doubleValue()), f0.b(context.getColor(next2.getKey().f197325b)), null));
                                it = it;
                                z19 = z19;
                                arrayList3 = arrayList3;
                            }
                            arrayList = arrayList3;
                            z15 = z19;
                            d14 = null;
                            cVarB = i53.a.e(arrayList2);
                            if (cVarB == null) {
                            }
                            c cVar4 = cVarB;
                            if (dVarA != null || (fVar = dVarA.f197346b.get(yi0.a.SUPERIOR)) == null) {
                                d15 = d14;
                            } else {
                                d15 = (Double) fVar.a(z15).c();
                            }
                            if (d15 != null) {
                                if (z14) {
                                    objValueOf = Float.valueOf((float) (dValueOf.doubleValue() / d15.doubleValue()));
                                } else if (z25) {
                                    objValueOf = Float.valueOf((float) (d16.doubleValue() / d15.doubleValue()));
                                } else {
                                    objValueOf = d14;
                                }
                                f14 = objValueOf;
                            } else {
                                f14 = d14;
                            }
                            if (zG && z24 && d16 != null) {
                                z16 = true;
                                strF0 = l3.a.F0(l3.f23124b, context, d16.doubleValue(), true);
                            } else {
                                z16 = true;
                                strF0 = d14;
                            }
                            if (zG && z24 && hVar2.getFtpCreateTime() != null) {
                                strA2 = fj0.a.a(context, hVar2.getFtpCreateTime(), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                            } else {
                                strA2 = d14;
                            }
                            if (zG && z24 && weight != null) {
                                strC1 = l3.a.C1(l3.f23124b, context, weight.doubleValue(), zY, false, null, 56);
                            } else {
                                strC1 = d14;
                            }
                            if (zG && z24 && hVar2.getWeightCreateTime() != null) {
                                strA3 = fj0.a.a(context, hVar2.getWeightCreateTime(), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                            } else {
                                strA3 = d14;
                            }
                            if (!zG || z24 || d16 == null) {
                                z17 = false;
                            } else {
                                z17 = z16;
                            }
                            str2.getClass();
                            o13.p pVar3 = new o13.p(cVar3, new gj0.e(str, str4, f14, cVar4, zG, z17, dValueOf, d16, weight, str2, str3, strF0, strA2, strC1, strA3));
                            linkedHashMap.put(pVar3.f128594a, pVar3.f128595b);
                            z19 = z15;
                            aVar3 = aVar3;
                            arrayList3 = arrayList;
                            z18 = z16;
                        } else {
                            arrayList = arrayList3;
                            z15 = z19;
                            d14 = null;
                        }
                        cVarB = j53.l.b();
                        c cVar5 = cVarB;
                        if (dVarA != null) {
                            d15 = d14;
                        } else {
                            d15 = d14;
                        }
                        if (d15 != null) {
                            if (z14) {
                                objValueOf = Float.valueOf((float) (dValueOf.doubleValue() / d15.doubleValue()));
                            } else if (z25) {
                                objValueOf = Float.valueOf((float) (d16.doubleValue() / d15.doubleValue()));
                            } else {
                                objValueOf = d14;
                            }
                            f14 = objValueOf;
                        } else {
                            f14 = d14;
                        }
                        if (zG) {
                            z16 = true;
                            strF0 = d14;
                        } else {
                            z16 = true;
                            strF0 = d14;
                        }
                        if (zG) {
                            strA2 = d14;
                        } else {
                            strA2 = d14;
                        }
                        if (zG) {
                            strC1 = d14;
                        } else {
                            strC1 = d14;
                        }
                        if (zG) {
                            strA3 = d14;
                        } else {
                            strA3 = d14;
                        }
                        if (zG) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        str2.getClass();
                        o13.p pVar4 = new o13.p(cVar3, new gj0.e(str, str4, f14, cVar5, zG, z17, dValueOf, d16, weight, str2, str3, strF0, strA2, strC1, strA3));
                        linkedHashMap.put(pVar4.f128594a, pVar4.f128595b);
                        z19 = z15;
                        aVar3 = aVar3;
                        arrayList3 = arrayList;
                        z18 = z16;
                    }
                    str3 = string3;
                    if (dVarA != null) {
                        Map<yi0.a, f> map2 = dVarA.f197346b;
                        arrayList2 = new ArrayList(map2.size());
                        it = map2.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<yi0.a, f> next3 = it.next();
                            j23.r<Double> rVarA2 = next3.getValue().a(z19);
                            arrayList2.add(new z72.l((float) (((Number) rVarA2.c()).doubleValue() - ((Number) rVarA2.getStart()).doubleValue()), f0.b(context.getColor(next3.getKey().f197325b)), null));
                            it = it;
                            z19 = z19;
                            arrayList3 = arrayList3;
                        }
                        arrayList = arrayList3;
                        z15 = z19;
                        d14 = null;
                        cVarB = i53.a.e(arrayList2);
                        if (cVarB == null) {
                        }
                        c cVar6 = cVarB;
                        if (dVarA != null) {
                            d15 = d14;
                        } else {
                            d15 = d14;
                        }
                        if (d15 != null) {
                            if (z14) {
                                objValueOf = Float.valueOf((float) (dValueOf.doubleValue() / d15.doubleValue()));
                            } else if (z25) {
                                objValueOf = Float.valueOf((float) (d16.doubleValue() / d15.doubleValue()));
                            } else {
                                objValueOf = d14;
                            }
                            f14 = objValueOf;
                        } else {
                            f14 = d14;
                        }
                        if (zG) {
                            z16 = true;
                            strF0 = d14;
                        } else {
                            z16 = true;
                            strF0 = d14;
                        }
                        if (zG) {
                            strA2 = d14;
                        } else {
                            strA2 = d14;
                        }
                        if (zG) {
                            strC1 = d14;
                        } else {
                            strC1 = d14;
                        }
                        if (zG) {
                            strA3 = d14;
                        } else {
                            strA3 = d14;
                        }
                        if (zG) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        str2.getClass();
                        o13.p pVar5 = new o13.p(cVar3, new gj0.e(str, str4, f14, cVar6, zG, z17, dValueOf, d16, weight, str2, str3, strF0, strA2, strC1, strA3));
                        linkedHashMap.put(pVar5.f128594a, pVar5.f128595b);
                        z19 = z15;
                        aVar3 = aVar3;
                        arrayList3 = arrayList;
                        z18 = z16;
                    } else {
                        arrayList = arrayList3;
                        z15 = z19;
                        d14 = null;
                    }
                    cVarB = j53.l.b();
                    c cVar7 = cVarB;
                    if (dVarA != null) {
                        d15 = d14;
                    } else {
                        d15 = d14;
                    }
                    if (d15 != null) {
                        if (z14) {
                            objValueOf = Float.valueOf((float) (dValueOf.doubleValue() / d15.doubleValue()));
                        } else if (z25) {
                            objValueOf = Float.valueOf((float) (d16.doubleValue() / d15.doubleValue()));
                        } else {
                            objValueOf = d14;
                        }
                        f14 = objValueOf;
                    } else {
                        f14 = d14;
                    }
                    if (zG) {
                        z16 = true;
                        strF0 = d14;
                    } else {
                        z16 = true;
                        strF0 = d14;
                    }
                    if (zG) {
                        strA2 = d14;
                    } else {
                        strA2 = d14;
                    }
                    if (zG) {
                        strC1 = d14;
                    } else {
                        strC1 = d14;
                    }
                    if (zG) {
                        strA3 = d14;
                    } else {
                        strA3 = d14;
                    }
                    if (zG) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    str2.getClass();
                    o13.p pVar6 = new o13.p(cVar3, new gj0.e(str, str4, f14, cVar7, zG, z17, dValueOf, d16, weight, str2, str3, strF0, strA2, strC1, strA3));
                    linkedHashMap.put(pVar6.f128594a, pVar6.f128595b);
                    z19 = z15;
                    aVar3 = aVar3;
                    arrayList3 = arrayList;
                    z18 = z16;
                }
                str = string;
                if (zG2) {
                    strA = context.getString(R.string.msg_sport_type_no_ftp_data, context.getString(cVar3.f197342d));
                } else {
                    strA = fj0.a.a(context, hVar2.getCalendarDate(), qi0.a.RELATIVE_YEAR_MONTH_DAY_WEEKDAY);
                }
                String str5 = strA;
                str5.getClass();
                if (z14) {
                    str2 = l3.f23129g.format(dValueOf.doubleValue());
                    arrayList3 = arrayList3;
                    weight = weight;
                } else {
                    if (z25) {
                        string2 = l3.a.F0(l3.f23124b, context, d16.doubleValue(), false);
                    } else {
                        string2 = context.getString(R.string.no_value);
                    }
                    str2 = string2;
                }
                if (aVarA != null) {
                    string3 = context.getString(aVarA.f197324a);
                } else {
                    if (zG) {
                    }
                    string3 = context.getString(R.string.common_watts);
                }
                str3 = string3;
                if (dVarA != null) {
                    Map<yi0.a, f> map3 = dVarA.f197346b;
                    arrayList2 = new ArrayList(map3.size());
                    it = map3.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<yi0.a, f> next4 = it.next();
                        j23.r<Double> rVarA3 = next4.getValue().a(z19);
                        arrayList2.add(new z72.l((float) (((Number) rVarA3.c()).doubleValue() - ((Number) rVarA3.getStart()).doubleValue()), f0.b(context.getColor(next4.getKey().f197325b)), null));
                        it = it;
                        z19 = z19;
                        arrayList3 = arrayList3;
                    }
                    arrayList = arrayList3;
                    z15 = z19;
                    d14 = null;
                    cVarB = i53.a.e(arrayList2);
                    if (cVarB == null) {
                    }
                    c cVar8 = cVarB;
                    if (dVarA != null) {
                        d15 = d14;
                    } else {
                        d15 = d14;
                    }
                    if (d15 != null) {
                        if (z14) {
                            objValueOf = Float.valueOf((float) (dValueOf.doubleValue() / d15.doubleValue()));
                        } else if (z25) {
                            objValueOf = Float.valueOf((float) (d16.doubleValue() / d15.doubleValue()));
                        } else {
                            objValueOf = d14;
                        }
                        f14 = objValueOf;
                    } else {
                        f14 = d14;
                    }
                    if (zG) {
                        z16 = true;
                        strF0 = d14;
                    } else {
                        z16 = true;
                        strF0 = d14;
                    }
                    if (zG) {
                        strA2 = d14;
                    } else {
                        strA2 = d14;
                    }
                    if (zG) {
                        strC1 = d14;
                    } else {
                        strC1 = d14;
                    }
                    if (zG) {
                        strA3 = d14;
                    } else {
                        strA3 = d14;
                    }
                    if (zG) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    str2.getClass();
                    o13.p pVar7 = new o13.p(cVar3, new gj0.e(str, str5, f14, cVar8, zG, z17, dValueOf, d16, weight, str2, str3, strF0, strA2, strC1, strA3));
                    linkedHashMap.put(pVar7.f128594a, pVar7.f128595b);
                    z19 = z15;
                    aVar3 = aVar3;
                    arrayList3 = arrayList;
                    z18 = z16;
                } else {
                    arrayList = arrayList3;
                    z15 = z19;
                    d14 = null;
                }
                cVarB = j53.l.b();
                c cVar9 = cVarB;
                if (dVarA != null) {
                    d15 = d14;
                } else {
                    d15 = d14;
                }
                if (d15 != null) {
                    if (z14) {
                        objValueOf = Float.valueOf((float) (dValueOf.doubleValue() / d15.doubleValue()));
                    } else if (z25) {
                        objValueOf = Float.valueOf((float) (d16.doubleValue() / d15.doubleValue()));
                    } else {
                        objValueOf = d14;
                    }
                    f14 = objValueOf;
                } else {
                    f14 = d14;
                }
                if (zG) {
                    z16 = true;
                    strF0 = d14;
                } else {
                    z16 = true;
                    strF0 = d14;
                }
                if (zG) {
                    strA2 = d14;
                } else {
                    strA2 = d14;
                }
                if (zG) {
                    strC1 = d14;
                } else {
                    strC1 = d14;
                }
                if (zG) {
                    strA3 = d14;
                } else {
                    strA3 = d14;
                }
                if (zG) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                str2.getClass();
                o13.p pVar8 = new o13.p(cVar3, new gj0.e(str, str5, f14, cVar9, zG, z17, dValueOf, d16, weight, str2, str3, strF0, strA2, strC1, strA3));
                linkedHashMap.put(pVar8.f128594a, pVar8.f128595b);
                z19 = z15;
                aVar3 = aVar3;
                arrayList3 = arrayList;
                z18 = z16;
            }
            gj0.a aVar7 = new gj0.a(i53.a.g(linkedHashMap));
            aVar3.f83969g = aVar7;
            return aVar7;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lgj0/d;", "<anonymous>", "(Lo82/a;)Lgj0/d;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.ftp.reports.presentation.viewmodel.FtpViewModel$ftpReportPageState$1", f = "FtpViewModel.kt", l = {126}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<o82.a, t13.d<? super d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f83977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateTime f83978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g f83979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f83980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f83981e;

        /* JADX INFO: renamed from: hj0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lwi0/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.ftp.reports.presentation.viewmodel.FtpViewModel$ftpReportPageState$1$ftpTask$1", f = "FtpViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
        public static final class C1662a extends i implements p<b0, t13.d<? super v2<? extends List<? extends wi0.a>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f83983a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f83984b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o82.a f83985c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List<String> f83986d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f83987e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1662a(a aVar, o82.a aVar2, List<String> list, g gVar, t13.d<? super C1662a> dVar) {
                super(2, dVar);
                this.f83984b = aVar;
                this.f83985c = aVar2;
                this.f83986d = list;
                this.f83987e = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1662a(this.f83984b, this.f83985c, this.f83986d, this.f83987e, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends wi0.a>>> dVar) {
                return ((C1662a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f83983a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f83984b;
                xi0.a aVar3 = aVar2.f83965c;
                String strU1 = aVar2.f83966d.U1();
                o82.a aVar4 = this.f83985c;
                fz0.c cVarA = fz0.d.a(aVar4.f130843a);
                fz0.c cVarA2 = fz0.d.a(aVar4.f130844b);
                t1 t1Var = this.f83987e == g.f130853f ? t1.DAILY : t1.WEEKLY;
                this.f83983a = 1;
                Object objC = aVar3.c(strU1, cVarA, cVarA2, this.f83986d, t1Var, this);
                return objC == aVar ? aVar : objC;
            }
        }

        /* JADX INFO: renamed from: hj0.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lwi0/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.ftp.reports.presentation.viewmodel.FtpViewModel$ftpReportPageState$1$powerToWeightTask$1", f = "FtpViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
        public static final class C1663b extends i implements p<b0, t13.d<? super v2<? extends List<? extends wi0.a>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f83988a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f83989b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o82.a f83990c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List<String> f83991d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f83992e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1663b(a aVar, o82.a aVar2, List<String> list, g gVar, t13.d<? super C1663b> dVar) {
                super(2, dVar);
                this.f83989b = aVar;
                this.f83990c = aVar2;
                this.f83991d = list;
                this.f83992e = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1663b(this.f83989b, this.f83990c, this.f83991d, this.f83992e, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends wi0.a>>> dVar) {
                return ((C1663b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f83988a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f83989b;
                xi0.a aVar3 = aVar2.f83965c;
                String strU1 = aVar2.f83966d.U1();
                o82.a aVar4 = this.f83990c;
                fz0.c cVarA = fz0.d.a(aVar4.f130843a);
                fz0.c cVarA2 = fz0.d.a(aVar4.f130844b);
                t1 t1Var = this.f83992e == g.f130853f ? t1.DAILY : t1.WEEKLY;
                this.f83988a = 1;
                Object objB = aVar3.b(strU1, cVarA, cVarA2, this.f83991d, t1Var, this);
                return objB == aVar ? aVar : objB;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = a.this.new b(dVar);
            bVar.f83981e = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super d> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:125:0x0326  */
        /* JADX WARN: Code duplicated, block: B:127:0x0329  */
        /* JADX WARN: Code duplicated, block: B:129:0x0332  */
        /* JADX WARN: Code duplicated, block: B:131:0x0358  */
        /* JADX WARN: Code duplicated, block: B:132:0x0363  */
        /* JADX WARN: Code duplicated, block: B:134:0x036b  */
        /* JADX WARN: Code duplicated, block: B:135:0x037b  */
        /* JADX WARN: Code duplicated, block: B:138:0x0395  */
        /* JADX WARN: Code duplicated, block: B:142:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:144:0x03b4  */
        /* JADX WARN: Code duplicated, block: B:147:0x03c5  */
        /* JADX WARN: Code duplicated, block: B:181:0x03ca A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v31, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r2v36, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v37, types: [java.util.ArrayList] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            DateTime dateTimeAtStartOfDay;
            int i14;
            int i15;
            Object objO;
            g gVar;
            DateTime dateTime;
            Iterable iterable;
            Iterable iterable2;
            int iA;
            int weeks;
            float f14;
            int i16;
            ?? C;
            c cVarE;
            LinkedHashMap linkedHashMap;
            int iA2;
            Map map;
            Map map2;
            int i17;
            int i18;
            DateTime dateTimePlusDays;
            String strPrint;
            Iterable iterable3;
            c cVarC;
            c cVarC2;
            o82.a aVar = (o82.a) this.f83981e;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i19 = this.f83980d;
            int i24 = 2;
            a aVar3 = a.this;
            if (i19 == 0) {
                r.b(obj);
                yi0.c.f197333f.getClass();
                ArrayList arrayListA = yi0.c.a.a();
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                int weeks2 = Weeks.weeksBetween(dateTimeAtStartOfDay2, dateTimeAtStartOfDay).getWeeks() + 1;
                g gVar2 = weeks2 != 4 ? weeks2 != 12 ? g.f130856i : g.f130854g : g.f130853f;
                w9.a aVarA = v1.a(aVar3);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                i14 = 0;
                j0 j0VarJ = ge1.b.j(aVarA, bVar, null, new C1663b(a.this, aVar, arrayListA, gVar2, null), 2);
                j0 j0VarJ2 = ge1.b.j(v1.a(aVar3), bVar, null, new C1662a(a.this, aVar, arrayListA, gVar2, null), 2);
                if (aVar3.f83969g == null) {
                    u82.a<o82.a, gj0.a> aVar4 = aVar3.f83972j;
                    o.Companion companion = o.INSTANCE;
                    o82.a aVar5 = new o82.a(g22.l.d(companion), g22.l.d(companion));
                    i15 = 1;
                    aVar4.i(aVar5, true);
                } else {
                    i15 = 1;
                }
                i0[] i0VarArr = new i0[2];
                i0VarArr[0] = j0VarJ;
                i0VarArr[i15] = j0VarJ2;
                List listK = x.k(i0VarArr);
                this.f83981e = null;
                this.f83977a = dateTimeAtStartOfDay2;
                this.f83978b = dateTimeAtStartOfDay;
                this.f83979c = gVar2;
                this.f83980d = i15;
                objO = g8.i.o(listK, this);
                if (objO == aVar2) {
                    return aVar2;
                }
                gVar = gVar2;
                dateTime = dateTimeAtStartOfDay2;
            } else {
                if (i19 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g gVar3 = this.f83979c;
                DateTime dateTime2 = this.f83978b;
                dateTime = this.f83977a;
                r.b(obj);
                gVar = gVar3;
                dateTimeAtStartOfDay = dateTime2;
                i15 = 1;
                i14 = 0;
                objO = obj;
            }
            List list = (List) objO;
            int i25 = i14;
            v2 v2Var = (v2) list.get(i25);
            v2 v2Var2 = (v2) list.get(i15);
            fj0.a aVar6 = fj0.a.f71826a;
            Context context = aVar3.f83963a;
            v2.b bVar2 = v2Var instanceof v2.b ? (v2.b) v2Var : null;
            if (bVar2 == null || (iterable = (List) bVar2.f47386a) == null) {
                iterable = p13.j0.f134944a;
            }
            v2.b bVar3 = v2Var2 instanceof v2.b ? (v2.b) v2Var2 : null;
            if (bVar3 == null || (iterable2 = (List) bVar3.f47386a) == null) {
                iterable2 = p13.j0.f134944a;
            }
            dateTime.getClass();
            dateTimeAtStartOfDay.getClass();
            aVar6.getClass();
            context.getClass();
            iterable.getClass();
            iterable2.getClass();
            gVar.getClass();
            pi0.e eVar = new pi0.e(context);
            pi0.a aVar7 = new pi0.a(context);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (yi0.c cVar2 : yi0.c.f197338k) {
                int i26 = cVar2 != yi0.c.ROWING ? 1 : i25;
                int i27 = fj0.a.C1461a.f71827a[gVar.ordinal()];
                if (i27 == 1) {
                    iterable3 = iterable2;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable3) {
                        if (s.g(((wi0.a) obj2).getSeries(), cVar2.f197340b)) {
                            arrayList.add(obj2);
                        }
                    }
                    cVarC = fj0.a.c(dateTime, arrayList);
                } else if (i27 != i24) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : iterable2) {
                        Iterable iterable4 = iterable2;
                        if (s.g(((wi0.a) obj3).getSeries(), cVar2.f197340b)) {
                            arrayList2.add(obj3);
                        }
                        iterable2 = iterable4;
                    }
                    iterable3 = iterable2;
                    cVarC = fj0.a.e(dateTime, arrayList2);
                } else {
                    iterable3 = iterable2;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : iterable3) {
                        if (s.g(((wi0.a) obj4).getSeries(), cVar2.f197340b)) {
                            arrayList3.add(obj4);
                        }
                    }
                    cVarC = fj0.a.d(dateTime, arrayList3);
                }
                int i28 = fj0.a.C1461a.f71827a[gVar.ordinal()];
                if (i28 == 1) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Iterator it3 = it;
                        if (s.g(((wi0.a) next).getSeries(), cVar2.f197340b)) {
                            arrayList4.add(next);
                        }
                        it = it3;
                    }
                    cVarC2 = fj0.a.c(dateTime, arrayList4);
                } else if (i28 != 2) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        Iterator it5 = it4;
                        if (s.g(((wi0.a) next2).getSeries(), cVar2.f197340b)) {
                            arrayList5.add(next2);
                        }
                        it4 = it5;
                    }
                    cVarC2 = fj0.a.e(dateTime, arrayList5);
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it6 = iterable.iterator();
                    while (it6.hasNext()) {
                        Object next3 = it6.next();
                        Iterator it7 = it6;
                        if (s.g(((wi0.a) next3).getSeries(), cVar2.f197340b)) {
                            arrayList6.add(next3);
                        }
                        it6 = it7;
                    }
                    cVarC2 = fj0.a.d(dateTime, arrayList6);
                }
                Map linkedHashMap4 = (Map) linkedHashMap2.get(cVar2);
                if (linkedHashMap4 == null) {
                    linkedHashMap4 = new LinkedHashMap();
                    linkedHashMap2.put(cVar2, linkedHashMap4);
                }
                yi0.b bVar4 = yi0.b.WATTS;
                linkedHashMap4.put(bVar4, cVarC);
                if (i26 != 0) {
                    linkedHashMap4.put(yi0.b.W_PER_KG, cVarC2);
                }
                Map linkedHashMap5 = (Map) linkedHashMap3.get(cVar2);
                if (linkedHashMap5 == null) {
                    linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap3.put(cVar2, linkedHashMap5);
                }
                fj0.a.f71826a.getClass();
                dateTime = dateTime;
                pi0.e eVar2 = eVar;
                Context context2 = context;
                pi0.a aVar8 = aVar7;
                linkedHashMap5.put(bVar4, fj0.a.b(context2, eVar2, aVar8, dateTime, gVar, bVar4, cVarC));
                if (i26 != 0) {
                    yi0.b bVar5 = yi0.b.W_PER_KG;
                    linkedHashMap5.put(bVar5, fj0.a.b(context2, eVar2, aVar8, dateTime, gVar, bVar5, cVarC2));
                }
                context = context2;
                eVar = eVar2;
                aVar7 = aVar8;
                iterable2 = iterable3;
                i25 = 0;
                i24 = 2;
            }
            int[] iArr = fj0.a.C1461a.f71827a;
            int i29 = iArr[gVar.ordinal()];
            if (i29 != 1) {
                if (i29 != 2) {
                    c22.j0.f23099a.getClass();
                    iA = k.a(c22.j0.S(dateTime), c22.j0.Q(dateTimeAtStartOfDay));
                } else {
                    weeks = Weeks.weeksBetween(dateTime, dateTimeAtStartOfDay).plus(1).getWeeks();
                }
                f14 = weeks;
                i16 = iArr[gVar.ordinal()];
                if (i16 != 1) {
                    C = c02.a.c(dateTime, dateTimeAtStartOfDay);
                } else if (i16 != 2) {
                    i17 = (int) f14;
                    C = new ArrayList(i17);
                    for (i18 = 0; i18 < i17; i18++) {
                        c22.j0.f23099a.getClass();
                        dateTimePlusDays = c22.j0.S(dateTime).plusDays(i18);
                        if (dateTimePlusDays.getDayOfMonth() == ((int) Math.rint(dateTimePlusDays.dayOfMonth().getMaximumValue() / 2.0f))) {
                            strPrint = DateTimeFormat.forPattern("MMM").print(dateTimePlusDays);
                        } else {
                            strPrint = "";
                        }
                        C.add(strPrint);
                    }
                } else {
                    DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("M/d");
                    dateTimeFormatterForPattern.getClass();
                    C = fz.a.e(null, 5, dateTime, dateTimeAtStartOfDay, dateTimeFormatterForPattern);
                }
                cVarE = i53.a.e(C);
                w13.c cVar3 = yi0.c.f197338k;
                iA2 = t0.a(y.r(cVar3, 10));
                if (iA2 < 16) {
                    iA2 = 16;
                }
                linkedHashMap = new LinkedHashMap(iA2);
                for (Object obj5 : cVar3) {
                    yi0.c cVar4 = (yi0.c) obj5;
                    map = (Map) linkedHashMap2.get(cVar4);
                    if (map == null) {
                        map = k0.f134949a;
                        map.getClass();
                    }
                    i53.d dVarG = i53.a.g(map);
                    map2 = (Map) linkedHashMap3.get(cVar4);
                    if (map2 == null) {
                        map2 = k0.f134949a;
                        map2.getClass();
                    }
                    g gVar4 = gVar;
                    gVar = gVar4;
                    linkedHashMap.put(obj5, new gj0.f(dVarG, i53.a.g(map2), cVarE, gVar4, Float.valueOf(f14)));
                }
                return new d(i53.a.g(linkedHashMap));
            }
            iA = k.a(dateTime, dateTimeAtStartOfDay);
            weeks = iA + 1;
            f14 = weeks;
            i16 = iArr[gVar.ordinal()];
            if (i16 != 1) {
                C = c02.a.c(dateTime, dateTimeAtStartOfDay);
            } else if (i16 != 2) {
                i17 = (int) f14;
                C = new ArrayList(i17);
                while (i18 < i17) {
                    c22.j0.f23099a.getClass();
                    dateTimePlusDays = c22.j0.S(dateTime).plusDays(i18);
                    if (dateTimePlusDays.getDayOfMonth() == ((int) Math.rint(dateTimePlusDays.dayOfMonth().getMaximumValue() / 2.0f))) {
                        strPrint = DateTimeFormat.forPattern("MMM").print(dateTimePlusDays);
                    } else {
                        strPrint = "";
                    }
                    C.add(strPrint);
                }
            } else {
                DateTimeFormatter dateTimeFormatterForPattern2 = DateTimeFormat.forPattern("M/d");
                dateTimeFormatterForPattern2.getClass();
                C = fz.a.e(null, 5, dateTime, dateTimeAtStartOfDay, dateTimeFormatterForPattern2);
            }
            cVarE = i53.a.e(C);
            w13.c cVar5 = yi0.c.f197338k;
            iA2 = t0.a(y.r(cVar5, 10));
            if (iA2 < 16) {
                iA2 = 16;
            }
            linkedHashMap = new LinkedHashMap(iA2);
            while (r0.hasNext()) {
                yi0.c cVar6 = (yi0.c) obj5;
                map = (Map) linkedHashMap2.get(cVar6);
                if (map == null) {
                    map = k0.f134949a;
                    map.getClass();
                }
                i53.d dVarG2 = i53.a.g(map);
                map2 = (Map) linkedHashMap3.get(cVar6);
                if (map2 == null) {
                    map2 = k0.f134949a;
                    map2.getClass();
                }
                g gVar5 = gVar;
                gVar = gVar5;
                linkedHashMap.put(obj5, new gj0.f(dVarG2, i53.a.g(map2), cVarE, gVar5, Float.valueOf(f14)));
            }
            return new d(i53.a.g(linkedHashMap));
        }
    }

    public a(Context context, ui0.b bVar, xi0.a aVar, l lVar, yi0.c cVar) {
        context.getClass();
        bVar.getClass();
        aVar.getClass();
        lVar.getClass();
        this.f83963a = context;
        this.f83964b = bVar;
        this.f83965c = aVar;
        this.f83966d = lVar;
        p2 p2VarA = r53.q2.a(cVar == null ? (yi0.c) h0.b0(yi0.c.f197338k) : cVar);
        this.f83967e = p2VarA;
        p2 p2VarA2 = r53.q2.a(h0.b0(yi0.b.f197329g));
        this.f83968f = p2VarA2;
        this.f83970h = r53.s.d(p2VarA);
        this.f83971i = r53.s.d(p2VarA2);
        this.f83972j = new u82.a<>(v1.a(this), new y82.e(new y82.c(new C1661a(null)), null, 2, null), false, 4, null);
        this.f83973k = new u82.a<>(v1.a(this), new y82.e(new y82.c(new b(null)), null, 2, null), false, 4, null);
    }

    public /* synthetic */ a(Context context, ui0.b bVar, xi0.a aVar, l lVar, yi0.c cVar, int i14, j jVar) {
        this(context, bVar, aVar, lVar, (i14 & 16) != 0 ? null : cVar);
    }
}
