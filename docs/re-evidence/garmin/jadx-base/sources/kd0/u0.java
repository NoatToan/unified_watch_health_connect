package kd0;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/u0;", "Lt60/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 implements t60.c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104380a;

        static {
            int[] iArr = new int[t60.a.values().length];
            try {
                iArr[t60.a.INDEX_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t60.a.SLEEP_BAND_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t60.a.BPM_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t60.a.EDGE_1050_BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t60.a.HERMES_BANNER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f104380a = iArr;
        }
    }

    @Override // t60.c
    public final String a() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.h("IndexBPMCrossSellImageURL");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    @Override // t60.c
    public final boolean b(t60.a aVar, String str, List<? extends sd2.f> list) {
        boolean zBooleanValue;
        DateTime dateTimePlusDays;
        aVar.getClass();
        boolean zH = h(aVar, list);
        if (str == null) {
            zBooleanValue = true;
        } else {
            DateTime dateTime = DateTime.parse(str);
            Boolean boolValueOf = (dateTime == null || (dateTimePlusDays = dateTime.plusDays(90)) == null) ? null : Boolean.valueOf(dateTimePlusDays.isBeforeNow());
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = true;
            }
        }
        return !zH && zBooleanValue;
    }

    @Override // t60.c
    public final boolean c() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("enable_cross_sell");
    }

    @Override // t60.c
    public final String d() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.h("ArmbandCrossSellImageURL");
    }

    @Override // t60.c
    public final String e() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.h("RufusCrossSellImageURL");
    }

    @Override // t60.c
    public final String f() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.h("IndexScale2CrossSellImageURL");
    }

    @Override // t60.c
    public final String g() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.h("HRM600CrossSellImageURL");
    }

    @Override // t60.c
    public final boolean h(t60.a aVar, List<? extends sd2.f> list) {
        boolean zN;
        aVar.getClass();
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                sd2.f fVar = (sd2.f) obj2;
                int i14 = a.f104380a[aVar.ordinal()];
                if (i14 == 1) {
                    zN = zb0.u0.n(fVar.getProductNumber(), zb0.u0.H0, zb0.u0.P5);
                } else if (i14 == 2) {
                    zN = zb0.u0.n(fVar.getProductNumber(), zb0.u0.Y5);
                } else if (i14 == 3) {
                    zN = zb0.u0.n(fVar.getProductNumber(), zb0.u0.S5);
                } else if (i14 == 4) {
                    zN = zb0.u0.n(fVar.getProductNumber(), zb0.u0.F);
                } else {
                    if (i14 != 5) {
                        lc.u0.r();
                        return false;
                    }
                    zN = zb0.u0.n(fVar.getProductNumber(), zb0.u0.X5);
                }
                if (zN) {
                    obj = obj2;
                    break;
                }
            }
            obj = (sd2.f) obj;
        }
        return obj != null;
    }
}
