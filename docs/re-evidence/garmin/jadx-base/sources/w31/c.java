package w31;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import c2.x2;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import com.garmin.android.apps.connectmobile.i2;
import e32.l;
import g22.n;
import gl1.y;
import h4.r;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.m;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.r0;
import s5.x0;
import tn.k;
import v.e0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lw31/c;", "Lw31/d;", "Li41/b;", "Landroid/view/View;", "view", "Le32/l;", "Lj41/b;", "navigator", "<init>", "(Landroid/view/View;Le32/l;)V", "a", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends d<i41.b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f181844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f181845g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HorseshoePieChart f181846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f181847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ComposeView f181848e;

    static {
        a aVar = new a(null);
        f181844f = aVar;
        f181845g = aVar.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view2, l<j41.b> lVar) {
        super(view2, lVar);
        view2.getClass();
        lVar.getClass();
        this.f181846c = (HorseshoePieChart) view2.findViewById(R.id.ohrv_piechart);
        this.f181847d = (ImageView) view2.findViewById(R.id.no_data_hrv_status_icon_layout);
        this.f181848e = (ComposeView) view2.findViewById(R.id.compose_view);
    }

    @Override // e32.p
    public final void a() {
        HorseshoePieChart horseshoePieChart = this.f181846c;
        horseshoePieChart.getClass();
        horseshoePieChart.setVisibility(8);
        ComposeView composeView = this.f181848e;
        if (composeView != null) {
            composeView.setContent(new z3.e(-1860839970, true, new b(this, 0)));
        }
    }

    @Override // e32.p
    public final boolean b(Object obj) {
        i41.b bVar = (i41.b) obj;
        if (bVar == null || !bVar.f().isEmpty()) {
            return false;
        }
        i41.f hrvSummary = bVar.getHrvSummary();
        return (hrvSummary != null ? hrvSummary.getLastNightAvg() : null) != null;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // e32.p
    public final void c(Object obj) {
        Unit unit;
        i41.b bVar;
        Integer num;
        i41.f fVar;
        int i14;
        int i15;
        float[] fArrY0;
        boolean z14;
        ?? SubList;
        String readingTimeGMT;
        i41.b bVar2 = (i41.b) obj;
        String str = f181845g;
        if (bVar2 != null) {
            i41.f hrvSummary = bVar2.getHrvSummary();
            if (hrvSummary != null) {
                String status = hrvSummary.getStatus();
                ImageView imageView = this.f181847d;
                HorseshoePieChart horseshoePieChart = this.f181846c;
                if (status != null && status.length() != 0 && !s.g(hrvSummary.getStatus(), "NONE")) {
                    imageView.getClass();
                    imageView.setVisibility(8);
                    horseshoePieChart.getClass();
                    horseshoePieChart.setVisibility(0);
                    e(horseshoePieChart, hrvSummary);
                } else if (hrvSummary.getWeeklyAvg() != null) {
                    imageView.getClass();
                    imageView.setVisibility(8);
                    horseshoePieChart.getClass();
                    horseshoePieChart.setVisibility(0);
                    e(horseshoePieChart, new i41.f((String) null, hrvSummary.getWeeklyAvg(), (Integer) null, (Integer) null, new i41.a(0, 0, 0, Double.valueOf(0.0d)), (String) null, (String) null, (String) null, 237, (j) null));
                }
                Integer lastNightAvg = hrvSummary.getLastNightAvg();
                n41.b.f123605a.getClass();
                ?? D1 = h0.d1(bVar2.f());
                String sleepStartTimestampGMT = bVar2.getSleepStartTimestampGMT();
                String sleepEndTimestampGMT = bVar2.getSleepEndTimestampGMT();
                boolean zIsEmpty = D1.isEmpty();
                a aVar = f181844f;
                if (!zIsEmpty && n.d(sleepStartTimestampGMT)) {
                    LocalDateTime localDateTime = new LocalDateTime(sleepStartTimestampGMT);
                    i41.c cVar = (i41.c) h0.n0(D1);
                    if (localDateTime.isAfter((cVar == null || (readingTimeGMT = cVar.getReadingTimeGMT()) == null) ? null : new LocalDateTime(readingTimeGMT))) {
                        D1.clear();
                        aVar.getClass();
                        String strH = e0.h(p6.b.i("verifyHrvReadingsData: HRV readings are not with in the sleep window , sleep:", bVar2.getSleepStartTimestampLocal(), StringUtils.SPACE, bVar2.getSleepEndTimestampLocal(), " HRV : "), bVar2.getStartTimestampLocal(), "  ", bVar2.getEndTimestampLocal());
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var, str, strH);
                    }
                }
                if (sleepStartTimestampGMT == null) {
                    sleepStartTimestampGMT = bVar2.getStartTimestampGMT();
                }
                LocalDateTime localDateTime2 = new LocalDateTime(sleepStartTimestampGMT);
                if (sleepEndTimestampGMT == null) {
                    sleepEndTimestampGMT = bVar2.getEndTimestampGMT();
                }
                LocalDateTime localDateTime3 = new LocalDateTime(sleepEndTimestampGMT);
                int minutes = !D1.isEmpty() ? Minutes.minutesBetween(new LocalDateTime(((i41.c) h0.b0(D1)).getReadingTimeGMT()), localDateTime3).getMinutes() / 5 : 0;
                if (minutes <= 0 || D1.isEmpty()) {
                    bVar = bVar2;
                    num = lastNightAvg;
                    fVar = hrvSummary;
                    if (minutes <= 0) {
                        D1.clear();
                    }
                    i14 = Integer.MIN_VALUE;
                    i15 = Integer.MAX_VALUE;
                } else {
                    LocalDateTime localDateTime4 = new LocalDateTime(((i41.c) h0.b0(D1)).getReadingTimeGMT());
                    i14 = Integer.MIN_VALUE;
                    i15 = Integer.MAX_VALUE;
                    int i16 = 1;
                    while (true) {
                        bVar = bVar2;
                        if (i16 >= D1.size()) {
                            num = lastNightAvg;
                            fVar = hrvSummary;
                            SubList = D1;
                            break;
                        }
                        int hrvValue = ((i41.c) D1.get(i16)).getHrvValue();
                        num = lastNightAvg;
                        fVar = hrvSummary;
                        LocalDateTime localDateTime5 = new LocalDateTime(((i41.c) D1.get(i16)).getReadingTimeGMT());
                        if (!localDateTime4.isBefore(localDateTime2)) {
                            if (!localDateTime5.isBefore(localDateTime3) && !localDateTime5.isEqual(localDateTime3)) {
                                SubList = D1.subList(0, i16);
                                break;
                            }
                            if (hrvValue > 1) {
                                if (i15 > hrvValue) {
                                    i15 = hrvValue;
                                } else if (i14 < hrvValue) {
                                    i14 = hrvValue;
                                }
                            }
                            int minutes2 = Minutes.minutesBetween(localDateTime4, localDateTime5).getMinutes();
                            String readingTimeGMT2 = ((i41.c) h0.b0(D1)).getReadingTimeGMT();
                            DateTimeZone dateTimeZone = DateTimeZone.UTC;
                            DateTime dateTimeL = j0.L(readingTimeGMT2, "yyyy-MM-dd'T'HH:mm:ss.SSS", dateTimeZone);
                            DateTime dateTimeL2 = j0.L(((i41.c) D1.get(i16)).getReadingTimeGMT(), "yyyy-MM-dd'T'HH:mm:ss.SSS", dateTimeZone);
                            if (dateTimeL != null && dateTimeL2 != null) {
                                ArrayList arrayListD = x.d(Integer.valueOf(minutes2), Integer.valueOf(Minutes.minutesBetween(dateTimeL.withEarlierOffsetAtOverlap(), dateTimeL2.withEarlierOffsetAtOverlap()).getMinutes()), Integer.valueOf(Minutes.minutesBetween(dateTimeL.withLaterOffsetAtOverlap(), dateTimeL2.withLaterOffsetAtOverlap()).getMinutes()));
                                if (arrayListD.isEmpty()) {
                                    String string = localDateTime4.plusMinutes(5).toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
                                    string.getClass();
                                    D1.add(i16, new i41.c(-1, string, String.valueOf(t31.b.a(string))));
                                } else {
                                    Iterator it = arrayListD.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            String string2 = localDateTime4.plusMinutes(5).toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
                                            string2.getClass();
                                            D1.add(i16, new i41.c(-1, string2, String.valueOf(t31.b.a(string2))));
                                        } else if (((Number) it.next()).intValue() <= 5) {
                                            i16++;
                                            localDateTime4 = localDateTime5;
                                        }
                                    }
                                }
                            }
                        } else {
                            D1.remove(i16 - 1);
                            localDateTime4 = new LocalDateTime(((i41.c) h0.b0(D1)).getReadingTimeGMT());
                        }
                        bVar2 = bVar;
                        lastNightAvg = num;
                        hrvSummary = fVar;
                    }
                    int size = SubList.size() - 1;
                    D1 = SubList;
                    if (size > minutes) {
                        aVar.getClass();
                        String strE = k.e(minutes, SubList.size(), "verifyHrvReadingsData: this is not expected , there is some problem with the data ", StringUtils.SPACE);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var2, str, strE);
                        D1 = SubList.subList(0, minutes);
                    }
                    int minutes3 = Minutes.minutesBetween(localDateTime2, new LocalDateTime(((i41.c) h0.b0(D1)).getReadingTimeGMT())).getMinutes() / 5;
                    if (minutes3 > 0) {
                        LocalDateTime localDateTime6 = localDateTime2;
                        while (true) {
                            String string3 = localDateTime6.toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
                            string3.getClass();
                            String strValueOf = String.valueOf(t31.b.a(string3));
                            String string4 = localDateTime6.toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
                            string4.getClass();
                            D1.add(0, new i41.c(-1, string4, strValueOf));
                            LocalDateTime localDateTimePlusMinutes = localDateTime6.plusMinutes(5);
                            LocalDateTime localDateTime7 = new LocalDateTime(localDateTimePlusMinutes != null ? localDateTimePlusMinutes.toString("yyyy-MM-dd'T'HH:mm:ss.SSS") : null);
                            minutes3--;
                            if (minutes3 <= 0) {
                                break;
                            } else {
                                localDateTime6 = localDateTime7;
                            }
                        }
                    }
                }
                ?? r24 = D1;
                if (i15 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE) {
                    fArrY0 = h0.Y0(x.m(Float.valueOf(50.0f), Float.valueOf(70.0f), Float.valueOf(90.0f), Float.valueOf(110.0f)));
                } else {
                    int i17 = i15 - 10;
                    if (i17 <= 0) {
                        i17 = 0;
                    }
                    int i18 = i14 + 10;
                    ArrayList arrayList = new ArrayList();
                    if (i17 == i18) {
                        i17 -= 2;
                        i18 = i14 + 12;
                    }
                    float f14 = (i18 - i17) / 2;
                    double dPow = Math.pow(10.0d, Math.floor(Math.log10(f14 < 1.0f ? 1.0d : f14)));
                    int i19 = ((int) ((((double) f14) / dPow) + 0.5d)) * ((int) dPow);
                    if (i19 <= 0) {
                        i19 = 1;
                    }
                    int i24 = (i17 * i19) / i19;
                    double d14 = i19;
                    double dCeil = Math.ceil(((double) i18) / d14) * d14;
                    do {
                        arrayList.add(Float.valueOf(i24));
                        i24 += i19;
                    } while (i24 <= dCeil);
                    fArrY0 = h0.Y0(arrayList);
                }
                int i25 = (int) fArrY0[0];
                int i26 = (int) fArrY0[fArrY0.length - 1];
                if (i26 <= i14) {
                    i26 = i14 + 10;
                }
                z31.a aVar4 = new z31.a(r24.size(), 0, i26, i25, localDateTime2, localDateTime3, r24);
                if (bVar.f().isEmpty()) {
                    i41.f hrvSummary2 = bVar.getHrvSummary();
                    if ((hrvSummary2 != null ? hrvSummary2.getLastNightAvg() : null) != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                ComposeView composeView = this.f181848e;
                if (composeView != null) {
                    composeView.setContent(new z3.e(-1066348739, true, new w31.a(this, fVar, num, z14, aVar4, 0)));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        i2.a aVar5 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar5.getClass();
        i2.a.b(a2Var3, str, "bind: Hrv chart data is null");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    public final void d(i41.f fVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        x0 x0Var;
        o0 o0VarE = mVar.E(-1409335941);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.r(this) ? 32 : 16);
        boolean z14 = true;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int iM = fVar != null ? fVar.m() : R.string.msg_no_data_available;
            int iG = fVar != null ? fVar.g() : R.string.ohrv_no_data_subtitle_wear_device;
            String strQ = y.Q(o0VarE, R.string.gcm_sleep_tracking_help_info);
            d6.h hVarA = null;
            s5.c.b bVarH = l2.h(o0VarE, -1457128675, 0, 1, null);
            o0VarE.C(-1457128366);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var2 = j92.f.f97932i;
            int iJ = bVarH.j(d92.c.b(x0Var2, o0VarE).f157322a);
            try {
                bVarH.b(y.Q(o0VarE, iG));
                Unit unit = Unit.INSTANCE;
                bVarH.f(iJ);
                o0VarE.g0(false);
                if (fVar != null && fVar.q()) {
                    o0VarE.C(319061821);
                    bVarH.b(StringUtils.SPACE);
                    fVar2.getClass();
                    x0Var = x0Var2;
                    r0 r0Var = new r0(x0.a(x0Var, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214).f157322a, null, null, null, 14, null);
                    boolean zR = o0VarE.r(this);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new t30.h(this, 1);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new t30.h(this, 1);
                            o0VarE.K(objQ);
                        }
                    }
                    int iG2 = bVarH.g(new s5.m.a(strQ, r0Var, (s5.n) objQ));
                    try {
                        bVarH.b(strQ);
                        bVarH.f(iG2);
                        o0VarE.g0(false);
                    } catch (Throwable th3) {
                        bVarH.f(iG2);
                        throw th3;
                    }
                } else {
                    x0Var = x0Var2;
                    o0VarE.C(319739326);
                    o0VarE.g0(false);
                }
                s5.c cVarK = bVarH.k();
                o0VarE.g0(false);
                String status = fVar != null ? fVar.getStatus() : null;
                if (status != null && status.length() != 0) {
                    z14 = false;
                }
                if (z14) {
                    d6.h.f57752b.getClass();
                    hVarA = d6.h.a(d6.h.f57755e);
                }
                d6.h hVar = hVarA;
                String strQ2 = y.Q(o0VarE, iM);
                fVar2.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                r.a aVar = r.S;
                r rVarF = x2.f(aVar, 1.0f);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97920e;
                bVar.getClass();
                mh.c(strQ2, c2.l.C(rVarF, f14, 0.0f, f15, eVar.f97918c, 2), 0L, null, 0L, null, 0L, hVar, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
                fVar2.getClass();
                x0 x0VarB2 = d92.c.b(x0Var, o0VarE);
                bVar.getClass();
                float f16 = eVar.f97920e;
                bVar.getClass();
                float f17 = eVar.f97920e;
                bVar.getClass();
                mh.d(cVarK, c2.l.C(aVar, f16, 0.0f, f17, eVar.f97920e, 2), 0L, 0L, 0L, hVar, 0L, 0, false, 0, 0, null, null, x0VarB2, o0VarE, 0, 0, 261116);
                o0Var = o0VarE;
            } catch (Throwable th4) {
                bVarH.f(iJ);
                throw th4;
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(this, fVar, i14, 2);
        }
    }

    public final void e(HorseshoePieChart horseshoePieChart, i41.f fVar) {
        e41.a aVar = new e41.a(fVar);
        vz.a aVar2 = new vz.a(horseshoePieChart, new e41.b(this.f181850b, false), new e41.c(horseshoePieChart));
        if (fVar.getWeeklyAvg() != null) {
            aVar2.a(aVar.f62861a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw31/c$a;", "", "<init>", "()V", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
