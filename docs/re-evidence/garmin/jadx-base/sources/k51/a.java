package k51;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import i53.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o51.i;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.x;
import p13.y;
import t41.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk51/a;", "", "<init>", "()V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f102935a = new a();

    /* JADX INFO: renamed from: k51.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1975a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102936a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.f162301d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.f162302e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.f162307j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.f162303f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.f162304g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.f162306i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.f162305h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.f162308k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.f162309l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f102936a = iArr;
        }
    }

    private a() {
    }

    public static i a(Context context, oi0.h hVar, List list, List list2, boolean z14) {
        c cVarE = i53.a.e(list);
        ArrayList arrayList = new ArrayList(y.r(list2, 10));
        int i14 = 0;
        for (Object obj : list2) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            PaceBandSplitDTO paceBandSplitDTO = (PaceBandSplitDTO) obj;
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h hVar2 = (h) it.next();
                f102935a.getClass();
                arrayList2.add(b(context, hVar, z14, hVar2, paceBandSplitDTO, i14));
            }
            arrayList.add(i53.a.e(arrayList2));
            i14 = i15;
        }
        return new i(cVarE, i53.a.e(arrayList), null, 4, null);
    }

    public static o51.h b(Context context, oi0.h hVar, boolean z14, h hVar2, PaceBandSplitDTO paceBandSplitDTO, int i14) {
        switch (C1975a.f102936a[hVar2.ordinal()]) {
            case 1:
                int i15 = i14 + 1;
                return new o51.h(String.valueOf(i15), null, i15, 2, null);
            case 2:
                double splitDistance = paceBandSplitDTO.getSplitDistance();
                j51.a.f97057a.getClass();
                String strA = j51.a.a(splitDistance, context, z14);
                return new o51.h(strA, oi0.c.A(context, new jy0.b(21), strA), splitDistance);
            case 3:
                double cumulativeDistanceFromStart = paceBandSplitDTO.getCumulativeDistanceFromStart();
                j51.a.f97057a.getClass();
                String strA2 = j51.a.a(cumulativeDistanceFromStart, context, z14);
                return new o51.h(strA2, oi0.c.A(context, new jy0.b(23), strA2), cumulativeDistanceFromStart);
            case 4:
                Float splitTime = paceBandSplitDTO.getSplitTime();
                long jD = MathKt.d(splitTime != null ? splitTime.floatValue() : 0.0f);
                l3.f23124b.getClass();
                return new o51.h(l3.a.b1(1000 * jD), hVar.d(jD, true), jD);
            case 5:
                double splitDistance2 = paceBandSplitDTO.getSplitDistance() / (z14 ? 1000.0d : 1609.344d);
                Float splitTime2 = paceBandSplitDTO.getSplitTime();
                double dFloatValue = ((double) (splitTime2 != null ? splitTime2.floatValue() : 0.0f)) / splitDistance2;
                long j8 = (long) dFloatValue;
                j51.a.f97057a.getClass();
                return new o51.h(j51.a.b(context, j8, z14), j51.a.c(context, j8, z14), dFloatValue);
            case 6:
                long cumulativeTimeFromStart = (long) paceBandSplitDTO.getCumulativeTimeFromStart();
                l3.f23124b.getClass();
                return new o51.h(l3.a.b1(1000 * cumulativeTimeFromStart), hVar.d(cumulativeTimeFromStart, true), cumulativeTimeFromStart);
            case 7:
                double cumulativeDistanceFromStart2 = paceBandSplitDTO.getCumulativeDistanceFromStart();
                j51.a.f97057a.getClass();
                String strA3 = j51.a.a(cumulativeDistanceFromStart2, context, z14);
                return new o51.h(strA3, oi0.c.A(context, new jy0.b(22), strA3), cumulativeDistanceFromStart2);
            case 8:
                long cumulativeTimeFromStart2 = (long) (paceBandSplitDTO.getCumulativeTimeFromStart() / (paceBandSplitDTO.getCumulativeDistanceFromStart() / (z14 ? 1000.0d : 1609.344d)));
                j51.a.f97057a.getClass();
                return new o51.h(j51.a.b(context, cumulativeTimeFromStart2, z14), j51.a.c(context, cumulativeTimeFromStart2, z14), cumulativeTimeFromStart2);
            case 9:
                Float elevationChange = paceBandSplitDTO.getElevationChange();
                double dFloatValue2 = elevationChange != null ? elevationChange.floatValue() : 0.0d;
                j51.a.f97057a.getClass();
                context.getClass();
                l3.f23124b.getClass();
                String strC0 = l3.a.c0(context, dFloatValue2, z14, true, true);
                return new o51.h(strC0, oi0.c.A(context, new jy0.b(24), strC0), dFloatValue2);
            default:
                u0.r();
                return null;
        }
    }
}
