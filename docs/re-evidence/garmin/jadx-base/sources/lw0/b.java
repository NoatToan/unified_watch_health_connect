package lw0;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import b63.o;
import b63.p;
import c22.r0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import j23.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p13.h0;
import p13.j0;
import p13.w;
import pi0.e;
import pi0.f;
import pv0.s;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115074a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f115074a = iArr;
        }
    }

    public static final void a(BitmapDrawable bitmapDrawable, Context context, boolean z14, l lVar) {
        Integer numValueOf;
        if (z14) {
            numValueOf = lVar.f207551h;
        } else {
            bw0.a.c.f21565a.getClass();
            numValueOf = Integer.valueOf(R.color.gds_data_viz_neutral_primary);
        }
        if (numValueOf != null) {
            bitmapDrawable.setTint(context.getColor(numValueOf.intValue()));
        }
    }

    public static final int b(g<o> gVar, boolean z14) {
        gVar.getClass();
        int iA = p.a((o) gVar.getStart(), (o) gVar.b());
        return z14 ? iA + 1 : (iA / 7) + 1;
    }

    public static final float c(g<o> gVar, boolean z14, boolean z15) {
        gVar.getClass();
        float f14 = z15 ? 0.5f : 0.0f;
        int iA = p.a((o) gVar.getStart(), (o) gVar.b());
        if (!z14) {
            iA /= 7;
        }
        return iA + f14;
    }

    public static final int d(boolean z14, boolean z15) {
        if (!z14) {
            bw0.a.b.f21564a.getClass();
            return R.color.gds_data_viz_neutral_primary;
        }
        if (z15) {
            bw0.a.C0329a.f21563a.getClass();
            return R.color.gds_data_viz_neutral_secondary;
        }
        bw0.a.c.f21565a.getClass();
        return R.color.gds_data_viz_neutral_primary;
    }

    public static final Integer e(boolean z14, l lVar) {
        if (z14) {
            return (lVar != null ? lVar.f207551h : null) == null ? Integer.valueOf(R.drawable.chart_item_square_fill) : lVar.f207550g;
        }
        bw0.a.c.f21565a.getClass();
        return Integer.valueOf(R.drawable.chart_item_circle);
    }

    public static final ArrayList f(DateTime dateTime, e eVar, Context context, kw0.e eVar2, String str, String str2, s sVar, boolean z14, boolean z15) {
        List listC;
        String string;
        eVar.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        if (z14) {
            if (z15) {
                l22.a aVar = new l22.a(context);
                String strI = i(true, dateTime, eVar);
                int i14 = sVar == null ? -1 : a.f115074a[sVar.ordinal()];
                if (i14 != 1) {
                    string = i14 != 2 ? aVar.getString(R.string.lbl_missing) : context.getString(R.string.lbl_no);
                } else {
                    string = context.getString(R.string.lbl_yes);
                }
                String str3 = string;
                str3.getClass();
                String string2 = aVar.getString(R.string.lbl_daily_log);
                bw0.a.C0329a.f21563a.getClass();
                bw0.a.f21562a.getClass();
                listC = w.c(new l(strI, str3, string2, null, null, null, Integer.valueOf(bw0.a.c(sVar)), bw0.a.b(sVar), 56, null));
            } else {
                Integer f106920d = eVar2.getF106920d();
                Integer f106919c = eVar2.getF106919c();
                Integer f106921e = eVar2.getF106921e();
                if (f106920d == null && f106919c == null && f106921e == null) {
                    listC = j0.f134944a;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    if (f106920d != null && f106920d.intValue() > 0) {
                        arrayList2.add(h(dateTime, eVar, context, f106920d.intValue(), s.YES));
                    }
                    if (f106919c != null && f106919c.intValue() > 0) {
                        arrayList2.add(h(dateTime, eVar, context, f106919c.intValue(), s.NO));
                    }
                    if (f106921e != null && f106921e.intValue() > 0) {
                        arrayList2.add(h(dateTime, eVar, context, f106921e.intValue(), null));
                    }
                    listC = arrayList2;
                }
            }
            arrayList.addAll(listC);
        }
        String strValueOf = String.valueOf(eVar2.getF106918b());
        String strI2 = i(z15, dateTime, eVar);
        Integer numValueOf = Integer.valueOf(d(z14, z15));
        bw0.a.c.f21565a.getClass();
        arrayList.add(new l(strI2, strValueOf, str, str2, null, numValueOf, Integer.valueOf(R.drawable.chart_item_circle), null, SyslogConstants.LOG_LOCAL2, null));
        return arrayList;
    }

    public static /* synthetic */ ArrayList g(DateTime dateTime, e eVar, Context context, kw0.e eVar2, String str, String str2, s sVar, boolean z14, boolean z15, int i14) {
        if ((i14 & 32) != 0) {
            str2 = null;
        }
        if ((i14 & 64) != 0) {
            sVar = null;
        }
        return f(dateTime, eVar, context, eVar2, str, str2, sVar, z14, z15);
    }

    public static final l h(DateTime dateTime, e eVar, Context context, int i14, s sVar) {
        String string;
        l22.a aVar = new l22.a(context);
        String strI = i(true, dateTime, eVar);
        int i15 = sVar == null ? -1 : a.f115074a[sVar.ordinal()];
        if (i15 != 1) {
            string = i15 != 2 ? aVar.getString(R.string.lbl_missing_days) : aVar.getString(R.string.lbl_no_days);
        } else {
            string = aVar.getString(R.string.lbl_yes_days);
        }
        String str = string;
        String strValueOf = String.valueOf(i14);
        bw0.a.f21562a.getClass();
        return new l(strI, strValueOf, str, null, null, null, Integer.valueOf(bw0.a.c(sVar)), bw0.a.b(sVar), 56, null);
    }

    public static final String i(boolean z14, DateTime dateTime, e eVar) {
        eVar.getClass();
        DateTime dateTimePlusDays = z14 ? null : dateTime.plusDays(6);
        if (z14) {
            return eVar.a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY);
        }
        return dateTimePlusDays != null ? eVar.l(dateTime, dateTimePlusDays, f.SHORT_MONTH_NO_WEEKDAY) : "";
    }

    public static final int j(o oVar, o oVar2, boolean z14) {
        oVar.getClass();
        oVar2.getClass();
        return p.a(oVar, oVar2) / (z14 ? 1 : 7);
    }

    public static final void k(ArrayList arrayList, Context context, boolean z14) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.chart_value_item_size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Entry entry : (List) it.next()) {
                Object data = entry.getData();
                BitmapDrawable bitmapDrawable = null;
                List list = data instanceof List ? (List) data : null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof l) {
                            arrayList2.add(obj);
                        }
                    }
                    l lVar = (l) h0.d0(arrayList2);
                    if (lVar != null) {
                        Integer numE = e(z14, lVar);
                        if (numE != null) {
                            BitmapDrawable bitmapDrawableC = r0.c(r0.f23226a, context, numE.intValue(), dimensionPixelSize);
                            if (bitmapDrawableC != null) {
                                a(bitmapDrawableC, context, z14, lVar);
                                bitmapDrawable = bitmapDrawableC;
                            }
                        }
                        entry.setIcon(bitmapDrawable);
                    }
                }
            }
        }
    }
}
