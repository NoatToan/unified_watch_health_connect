package un;

import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import e23.l;
import fz.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.u;
import p13.y;
import sn.d;
import sn.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lun/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3206a f172031f = new C3206a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f172032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public im.b f172033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public im.b f172034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public im.b f172035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public im.b f172036e;

    public a(l22.b bVar) {
        bVar.getClass();
        this.f172032a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [im.b] */
    /* JADX WARN: Type inference failed for: r13v6, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.ArrayList] */
    public final im.b a(h hVar, String str) {
        List<d> listB;
        Object next;
        ?? arrayList;
        ?? bVar = new im.b();
        sn.b bVar2 = hVar.f160401p;
        if (bVar2 == null || (listB = bVar2.b(str)) == null) {
            listB = j0.f134944a;
        }
        d dVar = (d) h0.d0(listB);
        double d14 = dVar != null ? dVar.f160371a : 0.0d;
        d dVar2 = (d) h0.n0(listB);
        double d15 = dVar2 != null ? dVar2.f160371a : 0.0d;
        Iterator it = listB.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((d) next).f160372b == null);
        if (((d) next) != null) {
            arrayList = new ArrayList(y.r(listB, 10));
            for (d dVar3 : listB) {
                double d16 = (dVar3.f160371a - d14) / ((double) 1000);
                Float f14 = dVar3.f160372b;
                arrayList.add(new o20.a(d16, f14 != null ? f14.floatValue() : Double.NaN));
            }
        } else {
            arrayList = j0.f134944a;
        }
        bVar.k(arrayList);
        bVar.C = new DateTime((long) d14);
        bVar.D = new DateTime((long) d15);
        bVar.f94119j = this.f172032a.getString(R.string.lbl_time_h_m_s);
        bVar.f94118i = c.TIME;
        bVar.f94116g = "label maximum";
        bVar.Y = "health_snapshot_key";
        return bVar;
    }

    public final ArrayList b() {
        return u.C(new im.b[]{this.f172033b, this.f172034c, this.f172035d, this.f172036e});
    }

    /* JADX INFO: renamed from: un.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lun/a$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3206a {
        public /* synthetic */ C3206a(j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
        public static float a(IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet, float f14, float f15, l lVar) {
            T entryForXValue = iBarLineScatterCandleBubbleDataSet.getEntryForXValue(f14, Float.NaN);
            if (entryForXValue == 0) {
                return -1.0f;
            }
            int entryIndex = iBarLineScatterCandleBubbleDataSet.getEntryIndex(entryForXValue);
            T entryForXValue2 = iBarLineScatterCandleBubbleDataSet.getEntryForXValue(f15, Float.NaN);
            if (entryForXValue2 == 0) {
                return -1.0f;
            }
            int entryIndex2 = iBarLineScatterCandleBubbleDataSet.getEntryIndex(entryForXValue2);
            int i14 = 0;
            float y14 = 0.0f;
            if (entryIndex <= entryIndex2) {
                while (true) {
                    ?? entryForIndex = iBarLineScatterCandleBubbleDataSet.getEntryForIndex(entryIndex);
                    if (entryForIndex != 0 && ((Boolean) lVar.invoke(Float.valueOf(entryForIndex.getY()))).booleanValue()) {
                        y14 += entryForIndex.getY();
                        i14++;
                    }
                    if (entryIndex == entryIndex2) {
                        break;
                    }
                    entryIndex++;
                }
            }
            if (i14 > 0) {
                return y14 / i14;
            }
            return 0.0f;
        }

        private C3206a() {
        }
    }
}
