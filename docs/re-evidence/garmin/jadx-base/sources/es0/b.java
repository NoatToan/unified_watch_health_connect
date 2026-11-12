package es0;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import gs1.t;
import gs1.v;
import gs1.x;
import j23.k;
import j23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.p0;
import p13.w;
import p13.y;
import yr0.j;
import zx0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Les0/b;", "Lqz/c;", "Lyr0/g;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lks0/c;", "formatter", "<init>", "(Landroid/content/Context;Lks0/c;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements qz.c<yr0.g, ILineDataSet> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f65178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LocalDateTime f65179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LocalDateTime f65180f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ks0.c f65182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.a f65183c;

    static {
        new a(null);
        f65178d = LocalDateTime.now().withTime(0, 0, 0, 0);
        f65179e = LocalDateTime.now().withTime(12, 0, 0, 0);
        f65180f = LocalDateTime.now().withTime(23, 0, 0, 0);
    }

    public b(Context context, ks0.c cVar) {
        context.getClass();
        cVar.getClass();
        this.f65181a = context;
        this.f65182b = cVar;
        this.f65183c = new l22.a(context);
    }

    @Override // qz.c
    public final List<ILineDataSet> a(yr0.g gVar) {
        l lVar = new l((int) 0.0f, (int) 1440.0f);
        ArrayList arrayList = new ArrayList(y.r(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (((k) it).f96801c) {
            arrayList.add(new Entry(((p0) it).nextInt(), 150.0f));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        Context context = this.f65181a;
        lineDataSet.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setLineWidth(0.0f);
        lineDataSet.setColor(context.getColor(R.color.transparent));
        return w.c(lineDataSet);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(yr0.g gVar) {
        return Integer.valueOf(Math.abs(MathKt.c(1440.0f)));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(yr0.g gVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(yr0.g gVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(yr0.g gVar) {
        return null;
    }

    @Override // qz.c
    public final List g(yr0.g gVar) {
        ArrayList arrayList;
        Context context;
        Object obj;
        yr0.g gVar2 = gVar;
        t tVar = gVar2 != null ? gVar2.f198959b : null;
        if (tVar != null) {
            ArrayList arrayListC = fs1.b.c(tVar);
            arrayList = new ArrayList();
            for (Object obj2 : arrayListC) {
                ((v) obj2).f78883a.getClass();
                arrayList.add(obj2);
            }
        } else {
            arrayList = null;
        }
        List listE = m.e(arrayList);
        LocalDateTime localDateTime = f65178d;
        localDateTime.getClass();
        xz.h hVarX = x(localDateTime);
        LocalDateTime localDateTime2 = f65179e;
        localDateTime2.getClass();
        xz.h hVarX2 = x(localDateTime2);
        int i14 = hVarX2.f192754a;
        LocalDateTime localDateTime3 = f65180f;
        localDateTime3.getClass();
        xz.h hVarX3 = x(localDateTime3);
        l lVar = new l(0, 7);
        ArrayList arrayList2 = new ArrayList(y.r(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (((k) it).f96801c) {
            LocalDateTime localDateTimePlusHours = localDateTime.plusHours(((p0) it).nextInt() * 4);
            localDateTimePlusHours.getClass();
            arrayList2.add(x(localDateTimePlusHours));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.add(new xz.h(DateTimeConstants.MINUTES_PER_DAY, null, this.f65182b.f106387f ? "24" : "12"));
        int i15 = (int) 0.0f;
        int i16 = (int) 1440.0f;
        Iterator it3 = listE.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            context = this.f65181a;
            if (!zHasNext) {
                break;
            }
            v vVar = (v) it3.next();
            v.a aVar = vVar.f78883a;
            int i17 = vVar.f78884b;
            Drawable drawableC = m.c(context, aVar);
            v.a aVar2 = vVar.f78883a;
            if (s.g(aVar2, v.a.e.C1590a.f78888b)) {
                if (hVarX.f192754a != i15) {
                    arrayList3.remove(hVarX);
                }
                arrayList3.add(new xz.h(i17, drawableC, null));
                if (Math.abs(i17 - i14) < 120) {
                    arrayList3.remove(hVarX2);
                }
                obj = null;
            } else if (s.g(aVar2, v.a.e.c.f78890b)) {
                if (i16 >= i17 && Math.abs(i17 - hVarX3.f192754a) < 120) {
                    arrayList3.remove(hVarX3);
                }
                obj = null;
                arrayList3.add(new xz.h(i17, drawableC, null));
                if (Math.abs(i17 - i14) < 120) {
                    arrayList3.remove(hVarX2);
                }
            } else {
                obj = null;
                int iH = m.h(vVar);
                if (i15 <= iH && iH <= i16) {
                    arrayList3.add(new xz.h(iH, drawableC, null, 4, null));
                }
            }
        }
        if (gVar2 != null) {
            yr0.f fVar = gVar2.f198958a;
            if (gVar2.a()) {
                LocalDate localDateI = fVar.i();
                List<j> listJ = fVar.j();
                if (listJ != null) {
                    for (j jVar : listJ) {
                        LocalDate localDateJ = jVar.j("yyyy-MM-dd'T'HH:mm:ss");
                        LocalTime localTimeO = jVar.o("yyyy-MM-dd'T'HH:mm:ss");
                        if (localDateJ != null && localTimeO != null && g22.k.g(localDateJ, localDateI)) {
                            arrayList3.add(new xz.h(localTimeO.getMinuteOfHour() + (localTimeO.getHourOfDay() * 60), a7.b.getDrawable(context, R.drawable.ic_jet_lag_take_off), null, 4, null));
                        }
                        LocalDate localDateB = jVar.b("yyyy-MM-dd'T'HH:mm:ss");
                        LocalTime localTimeG = jVar.g("yyyy-MM-dd'T'HH:mm:ss");
                        if (localDateB != null && g22.k.g(localDateB, localDateI) && localTimeG != null) {
                            arrayList3.add(new xz.h(localTimeG.getMinuteOfHour() + (localTimeG.getHourOfDay() * 60), a7.b.getDrawable(context, R.drawable.ic_jet_lag_landing), null, 4, null));
                        }
                    }
                }
            }
        }
        return arrayList3;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(yr0.g gVar) {
        return 200.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(yr0.g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(yr0.g gVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(yr0.g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(yr0.g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(yr0.g gVar) {
        return 1440.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(yr0.g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(yr0.g gVar) {
        return 60.0f;
    }

    @Override // qz.c
    public final List u(yr0.g gVar) {
        yr0.g gVar2 = gVar;
        if (gVar2 == null || !gVar2.a()) {
            return null;
        }
        return w.c(new xz.f(this.f65183c.getString(R.string.lbl_air_travel), null, Integer.valueOf(this.f65181a.getColor(R.color.gcm_jet_lag_travel_legend)), null, xz.g.a.f192745a, null, null, 106, null));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(yr0.g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(yr0.g gVar) {
        return 0.0f;
    }

    public final xz.h x(LocalDateTime localDateTime) {
        v vVarB = x.b(localDateTime, localDateTime, new v.a.c(null), null);
        if (vVarB == null) {
            return new xz.h(1, null, null);
        }
        int i14 = vVarB.f78884b;
        int i15 = ks0.c.f106381g;
        return new xz.h(i14, null, this.f65182b.d(false, false, i14));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001c\u0010\f\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Les0/b$a;", "", "<init>", "()V", "", "MINUTES_IN_AN_HOUR", "I", "Lorg/joda/time/LocalDateTime;", "kotlin.jvm.PlatformType", "START_DAY_TIMELINE_ENTRY_DATE", "Lorg/joda/time/LocalDateTime;", "MID_DAY_TIMELINE_ENTRY_DATE", "END_DAY_TIMELINE_ENTRY_DATE", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
