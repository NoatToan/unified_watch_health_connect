package wc1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import fg0.d;
import fg0.j;
import g22.k;
import g6.c;
import g6.f;
import g6.o;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.t1;
import lc.u0;
import n92.g;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.s0;
import s5.x0;
import u1.a2;
import v.h;
import w5.q;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f184310a;

    /* JADX INFO: renamed from: wc1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3414a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((tc1.a) t7).f163811a, ((tc1.a) t14).f163811a);
        }
    }

    static {
        f.a aVar = f.f75994b;
        f184310a = 300;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [org.joda.time.DateTime] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [org.joda.time.DateTime] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [o4.v0] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Float, java.lang.Number] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [org.joda.time.DateTime] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void a(List<tc1.a> list, LocalDate localDate, j jVar, LocalDate localDate2, sc1.a aVar, Double d14, m mVar, int i14) {
        Throwable th3;
        Double dValueOf;
        List listN0;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i15;
        float f14;
        ?? fVar;
        float fB;
        float fA;
        float f15;
        float f16;
        ?? r14;
        Integer numValueOf;
        ?? r15;
        Integer numValueOf2;
        ?? r16;
        Integer numValueOf3;
        ?? ValueOf;
        Long l14;
        Long l15;
        Long l16;
        LocalDate localDate3;
        LocalDate localDate4;
        ArrayList arrayList4;
        Float fValueOf;
        ?? r17;
        Float fValueOf2;
        d customGoal;
        DateTime dateTimeI;
        aVar.getClass();
        o0 o0VarE = mVar.E(1446326617);
        int i16 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(localDate) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(jVar) : o0VarE.r(jVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(localDate2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.k(aVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.B(d14) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            LocalDate localDate5 = (jVar == null || (dateTimeI = jVar.i()) == null) ? null : dateTimeI.toLocalDate();
            Double value = (jVar == null || (customGoal = jVar.getCustomGoal()) == null) ? null : customGoal.getValue();
            Double d15 = value;
            if (value != null) {
                Double dH = d14 != null ? u0.h(d15.doubleValue(), d14) : null;
                if (dH != null) {
                    double dDoubleValue = dH.doubleValue();
                    l3.a aVar2 = l3.f23124b;
                    th3 = null;
                    boolean zC = mg0.b.c();
                    aVar2.getClass();
                    dValueOf = Double.valueOf(l3.a.u(dDoubleValue, zC));
                } else {
                    th3 = null;
                    dValueOf = null;
                }
            } else {
                th3 = null;
                dValueOf = null;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            if (list == null || (listN0 = h0.N0(list, new C3414a())) == null) {
                listN0 = j0.f134944a;
            }
            int iA = 180;
            float f17 = Float.MAX_VALUE;
            if (listN0.isEmpty()) {
                arrayList = arrayList10;
                arrayList2 = arrayList11;
                dValueOf = dValueOf;
                arrayList3 = arrayList9;
                i15 = 180;
                f14 = Float.MIN_VALUE;
            } else {
                tc1.a aVar3 = (tc1.a) h0.m0(listN0);
                List list2 = listN0;
                String str = ((tc1.a) h0.b0(listN0)).f163811a;
                LocalDate localDate6 = str == null ? localDate5 : LocalDate.parse(str, DateTimeFormat.forPattern("yyyy-MM-dd"));
                if (localDate6 != null && localDate != null) {
                    DateTime dateTimeAtStartOfDay = localDate6.toDateTimeAtStartOfDay();
                    DateTime dateTimeAtStartOfDay2 = localDate.toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay.getClass();
                    dateTimeAtStartOfDay2.getClass();
                    iA = k.a(dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
                }
                i15 = iA;
                float fMin = Float.MAX_VALUE;
                float fMax = Float.MIN_VALUE;
                int i17 = 0;
                for (Object obj : list2) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        x.q();
                        throw th3;
                    }
                    ArrayList arrayList12 = arrayList9;
                    tc1.a aVar4 = (tc1.a) obj;
                    ArrayList arrayList13 = arrayList10;
                    Long l17 = aVar4.f163812b;
                    Double d16 = aVar4.f163817g;
                    if (l17 == null && d16 == null) {
                        arrayList4 = arrayList11;
                        localDate4 = localDate6;
                    } else {
                        if (aVar != sc1.a.Time) {
                            ArrayList arrayList14 = arrayList11;
                            localDate4 = localDate6;
                            if (d16 != null) {
                                double dDoubleValue2 = d16.doubleValue();
                                l3.a aVar5 = l3.f23124b;
                                arrayList4 = arrayList14;
                                boolean zC2 = mg0.b.c();
                                aVar5.getClass();
                                fValueOf = Float.valueOf(l3.a.u(dDoubleValue2, zC2));
                            } else {
                                arrayList4 = arrayList14;
                                r17 = th3;
                            }
                        } else if (l17 != null) {
                            ArrayList arrayList15 = arrayList11;
                            localDate4 = localDate6;
                            fValueOf2 = Float.valueOf(l17.longValue());
                            arrayList4 = arrayList15;
                        } else {
                            localDate4 = localDate6;
                            arrayList4 = arrayList11;
                            r17 = th3;
                        }
                        if (r17 != 0) {
                            r17 = fValueOf;
                            r17 = fValueOf2;
                            fMin = Math.min(fMin, r17.floatValue());
                            fMax = Math.max(fMax, r17.floatValue());
                        }
                        if (r17 != 0) {
                            arrayList6.add(new m92.h0.e.a(i17, r17.floatValue()));
                        }
                        arrayList5.add(aVar4);
                    }
                    i17 = i18;
                    arrayList11 = arrayList4;
                    localDate6 = localDate4;
                    arrayList9 = arrayList12;
                    arrayList10 = arrayList13;
                }
                ArrayList arrayList16 = arrayList10;
                ArrayList arrayList17 = arrayList11;
                LocalDate localDate7 = localDate6;
                ArrayList arrayList18 = arrayList9;
                if (aVar == sc1.a.Time) {
                    b bVar = b.f184311a;
                    ?? ValueOf2 = d15 != null ? Float.valueOf((float) d15.doubleValue()) : th3;
                    bVar.getClass();
                    fB = b.b(fMin, ValueOf2, aVar3, aVar);
                    fA = b.a(fMax, d15 != null ? Float.valueOf((float) d15.doubleValue()) : th3, aVar3, aVar);
                } else {
                    b bVar2 = b.f184311a;
                    ?? ValueOf3 = dValueOf != 0 ? Float.valueOf((float) dValueOf.doubleValue()) : th3;
                    bVar2.getClass();
                    fB = b.b(fMin, ValueOf3, aVar3, aVar);
                    fA = b.a(fMax, dValueOf != 0 ? Float.valueOf((float) dValueOf.doubleValue()) : th3, aVar3, aVar);
                }
                if (fA - fB > 180.0f) {
                    f15 = fB - (fB * 0.1f);
                    f16 = (0.1f * fA) + fA;
                } else {
                    f15 = fB - 90.0f;
                    f16 = fA + 90.0f;
                }
                f17 = f15;
                if (i15 >= 0) {
                    int i19 = 0;
                    while (true) {
                        if (d15 != null && dValueOf != 0) {
                            arrayList7.add(aVar == sc1.a.Time ? new m92.h0.e.a(i19, (float) d15.doubleValue()) : new m92.h0.e.a(i19, (float) dValueOf.doubleValue()));
                        }
                        if (i19 == 0) {
                            localDate3 = localDate7;
                            if (k.g(localDate3, localDate5)) {
                                c22.j0 j0Var = c22.j0.f23099a;
                                ?? dateTimeAtStartOfDay3 = localDate5 != null ? localDate5.toDateTimeAtStartOfDay() : th3;
                                j0Var.getClass();
                                ?? K = c22.j0.k(dateTimeAtStartOfDay3, 'S');
                                if (K.length() == 0) {
                                    K = th3;
                                }
                                if (K != 0) {
                                    String string = context.getString(R.string.string_string_bracket_pattern, context.getString(R.string.event_added), K);
                                    string.getClass();
                                    arrayList2 = arrayList17;
                                    arrayList2.add(string);
                                } else {
                                    arrayList2 = arrayList17;
                                }
                            } else {
                                arrayList2 = arrayList17;
                                c22.j0 j0Var2 = c22.j0.f23099a;
                                ?? dateTimeAtStartOfDay4 = localDate3 != null ? localDate3.toDateTimeAtStartOfDay() : th3;
                                j0Var2.getClass();
                                ?? K2 = c22.j0.k(dateTimeAtStartOfDay4, 'S');
                                if (K2.length() == 0) {
                                    K2 = th3;
                                }
                                if (K2 != 0) {
                                    arrayList2.add(K2);
                                }
                            }
                        } else {
                            arrayList2 = arrayList17;
                            localDate3 = localDate7;
                            if (i19 == i15) {
                                c22.j0 j0Var3 = c22.j0.f23099a;
                                ?? dateTimeAtStartOfDay5 = localDate != null ? localDate.toDateTimeAtStartOfDay() : th3;
                                j0Var3.getClass();
                                ?? K3 = c22.j0.k(dateTimeAtStartOfDay5, 'S');
                                if (K3.length() == 0) {
                                    K3 = th3;
                                }
                                if (K3 != 0) {
                                    String string2 = context.getString(R.string.string_string_bracket_pattern, context.getString(R.string.lbl_pacepro_event_date), K3);
                                    string2.getClass();
                                    arrayList2.add(string2);
                                }
                            } else {
                                if (i19 % 7 == 0) {
                                    arrayList2.add("");
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        if (i19 == i15) {
                            break;
                        }
                        i19++;
                        localDate7 = localDate3;
                        arrayList17 = arrayList2;
                    }
                } else {
                    arrayList2 = arrayList17;
                }
                sc1.a aVar6 = sc1.a.Time;
                if (aVar == aVar6) {
                    l16 = aVar3.f163814d;
                } else {
                    Double d17 = aVar3.f163819i;
                    if (d17 != null) {
                        double dDoubleValue3 = d17.doubleValue();
                        l3.a aVar7 = l3.f23124b;
                        boolean zC3 = mg0.b.c();
                        aVar7.getClass();
                        numValueOf = Integer.valueOf(l3.a.u(dDoubleValue3, zC3));
                    } else {
                        r14 = th3;
                    }
                }
                if (aVar == aVar6) {
                    r14 = numValueOf;
                    l15 = aVar3.f163815e;
                } else {
                    r14 = numValueOf;
                    Double d18 = aVar3.f163820j;
                    if (d18 != null) {
                        double dDoubleValue4 = d18.doubleValue();
                        l3.a aVar8 = l3.f23124b;
                        boolean zC4 = mg0.b.c();
                        aVar8.getClass();
                        numValueOf2 = Integer.valueOf(l3.a.u(dDoubleValue4, zC4));
                    } else {
                        r15 = th3;
                    }
                }
                if (aVar == aVar6) {
                    r14 = l16;
                    r14 = l16;
                    r15 = numValueOf2;
                    l14 = aVar3.f163813c;
                } else {
                    r14 = l16;
                    r14 = l16;
                    r15 = numValueOf2;
                    Double d19 = aVar3.f163818h;
                    if (d19 != null) {
                        double dDoubleValue5 = d19.doubleValue();
                        l3.a aVar9 = l3.f23124b;
                        boolean zC5 = mg0.b.c();
                        aVar9.getClass();
                        numValueOf3 = Integer.valueOf(l3.a.u(dDoubleValue5, zC5));
                    } else {
                        r16 = th3;
                    }
                }
                if (aVar == aVar6) {
                    r14 = l16;
                    r15 = l15;
                    r14 = l16;
                    r15 = l15;
                    r16 = numValueOf3;
                    r14 = l16;
                    r15 = l15;
                    r16 = l14;
                    ValueOf = aVar3.f163812b;
                } else {
                    r14 = l16;
                    r15 = l15;
                    r14 = l16;
                    r15 = l15;
                    r16 = numValueOf3;
                    Double d24 = aVar3.f163817g;
                    if (d24 != null) {
                        r14 = l16;
                        r15 = l15;
                        r16 = l14;
                        double dDoubleValue6 = d24.doubleValue();
                        l3.a aVar10 = l3.f23124b;
                        boolean zC6 = mg0.b.c();
                        aVar10.getClass();
                        ValueOf = Integer.valueOf(l3.a.u(dDoubleValue6, zC6));
                    } else {
                        r14 = l16;
                        r15 = l15;
                        r16 = l14;
                        ValueOf = th3;
                    }
                }
                int size = arrayList6.size() - 1;
                if (ValueOf == 0 || r16 == 0 || r14 == 0 || r15 == 0) {
                    arrayList3 = arrayList18;
                    arrayList = arrayList16;
                } else {
                    float f18 = size;
                    arrayList8.add(new m92.h0.d.b(f18, ValueOf.floatValue(), ValueOf.floatValue()));
                    float f19 = i15;
                    arrayList8.add(new m92.h0.d.b(f19, r14.floatValue(), r16.floatValue()));
                    arrayList = arrayList16;
                    arrayList.add(new m92.h0.d.b(f18, ValueOf.floatValue(), ValueOf.floatValue()));
                    arrayList.add(new m92.h0.d.b(f19, r16.floatValue(), r15.floatValue()));
                    m92.h0.e.a aVar11 = new m92.h0.e.a(f18, ValueOf.floatValue());
                    arrayList3 = arrayList18;
                    arrayList3.add(aVar11);
                    arrayList3.add(new m92.h0.e.a(f19, r16.floatValue()));
                }
                f14 = f16;
            }
            float f22 = f17;
            y3 y3Var = t1.f91493k;
            q.b bVar3 = (q.b) o0VarE.A(y3Var);
            y3 y3Var2 = t1.f91490h;
            ArrayList arrayList19 = arrayList3;
            g6.d dVar = new g6.d(((c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
            y3 y3Var3 = t1.f91496n;
            s0 s0Var = new s0(bVar3, dVar, (o) o0VarE.A(y3Var3), 0, 8, null);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97935l;
            x0 x0VarF = d92.c.f(x0Var, o0VarE);
            Boolean bool = Boolean.TRUE;
            context.getClass();
            Drawable drawable = a7.b.getDrawable(context, R.drawable.event_finish_flag);
            if (drawable != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                fVar = new o4.f(bitmapCreateBitmap);
            } else {
                fVar = th3;
            }
            n92.d dVar2 = new n92.d(arrayList2, s0Var, x0VarF, bool, fVar);
            s0 s0Var2 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
            fVar2.getClass();
            g gVar = new g(sn.a.c(o0VarE), s0Var2, d92.c.f(x0Var, o0VarE), null, 8, null);
            r.a aVar12 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar12, o0VarE);
            h5.g.V.getClass();
            e0.a aVar13 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar13);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            float f24 = i15;
            n92.j jVar2 = new n92.j(aVar == sc1.a.Time ? new uc1.g() : new uc1.a(), Float.valueOf(f22), Float.valueOf(f14), 5);
            r rVarF = x2.f(x2.h(aVar12, f184310a), 1.0f);
            d92.b.f58625c.getClass();
            vc1.c.a(a2.b(l.A(rVarF, j92.b.f97899b.f97916a, 0.0f, 2), a2.a(o0VarE), true), arrayList7, arrayList6, arrayList8, arrayList19, arrayList, Float.valueOf(f24), null, Float.valueOf(-1.0f), Float.valueOf(f24 - 1.0f), dVar2, jVar2, gVar, z3.f.c(-2008791441, new ku1.l(aVar, d15, localDate2, dValueOf, arrayList5, 28), o0VarE), o0VarE, 48);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(list, localDate, jVar, localDate2, aVar, d14, i14, 21);
        }
    }
}
