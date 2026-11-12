package bt0;

import c22.j0;
import c22.l3;
import f12.l;
import java.util.LinkedHashMap;
import java.util.List;
import lc.u0;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbt0/b;", "", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lxs0/a;", "lactateThresholdSportType", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lxs0/a;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f21034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f21035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xs0.a f21036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xs0.b f21037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p<Float, Float> f21038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p<Float, Float> f21039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<k> f21040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<k> f21041h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21042a;

        static {
            int[] iArr = new int[xs0.b.values().length];
            try {
                iArr[xs0.b.HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xs0.b.PACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xs0.b.POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xs0.b.POWER_PER_KG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21042a = iArr;
        }
    }

    public b(LocalDate localDate, LocalDate localDate2, xs0.a aVar) {
        localDate.getClass();
        localDate2.getClass();
        aVar.getClass();
        this.f21034a = localDate;
        this.f21035b = localDate2;
        this.f21036c = aVar;
        this.f21037d = xs0.b.PACE;
    }

    public abstract int a(LocalDate localDate, LocalDate localDate2);

    public final List<k> b(vs0.c cVar) {
        String strB;
        List<k> list = this.f21041h;
        if (list != null) {
            return list;
        }
        List<o61.b> listB = cVar != null ? cVar.b(xs0.b.HEART_RATE) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (listB != null) {
            for (o61.b bVar : listB) {
                DateTime dateTimeA = bVar.a();
                if (dateTimeA != null && (strB = j0.b(dateTimeA, "yyyy-MM-dd", DateTimeZone.UTC)) != null) {
                    Double value = bVar.getValue();
                    linkedHashMap.put(strB, new k(dateTimeA, value != null ? value.doubleValue() : 0.0d));
                }
            }
        }
        List<k> listB1 = h0.b1(linkedHashMap.values());
        this.f21041h = listB1;
        return listB1;
    }

    public final p<Float, Float> c(vs0.c cVar) {
        p<Float, Float> pVarE;
        p<Float, Float> pVar = this.f21039f;
        if (pVar != null) {
            return pVar;
        }
        List<k> listD = d(cVar);
        int i14 = a.f21042a[this.f21037d.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            pVarE = new h(listD).e(5);
        } else {
            if (i14 != 4) {
                u0.r();
                return null;
            }
            pVarE = new g(listD).e(5);
        }
        this.f21039f = pVarE;
        return pVarE;
    }

    public final List<k> d(vs0.c cVar) {
        String strB;
        k kVar;
        int iP;
        List<k> list = this.f21040g;
        if (list != null) {
            return list;
        }
        List<o61.b> listB = cVar != null ? cVar.b(this.f21037d) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        if (listB != null) {
            for (o61.b bVar : listB) {
                DateTime dateTimeA = bVar.a();
                if (dateTimeA != null && (strB = j0.b(dateTimeA, "yyyy-MM-dd", DateTimeZone.UTC)) != null) {
                    double d14 = 0.0d;
                    if (this.f21037d == xs0.b.PACE) {
                        Double value = bVar.getValue();
                        if (value != null) {
                            double dDoubleValue = value.doubleValue();
                            cVar.getClass();
                            if (!Double.isNaN(dDoubleValue)) {
                                dDoubleValue *= (double) 10;
                            }
                            if (vs0.c.a.f179737b[this.f21036c.ordinal()] == 1) {
                                l3.f23124b.getClass();
                                iP = l3.a.q(dDoubleValue);
                            } else {
                                l3.f23124b.getClass();
                                iP = l3.a.p(dDoubleValue, zY);
                            }
                            d14 = iP;
                        }
                        kVar = new k(dateTimeA, d14);
                    } else {
                        Double value2 = bVar.getValue();
                        kVar = new k(dateTimeA, value2 != null ? value2.doubleValue() : 0.0d);
                    }
                    linkedHashMap.put(strB, kVar);
                }
            }
        }
        List<k> listB1 = h0.b1(linkedHashMap.values());
        this.f21040g = listB1;
        return listB1;
    }
}
