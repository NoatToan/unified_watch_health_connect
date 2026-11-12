package z42;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import gs1.t;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lz42/g;", "", "Lz42/b;", "dailyPushesDTO", "", "Lz42/f;", "dailyChartDataDTO", "Lgs1/t;", "dailyTimelineDTO", "Lz42/h;", "personalRecordsData", "<init>", "(Lz42/b;Ljava/util/List;Lgs1/t;Ljava/util/List;)V", "a", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f202396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<f> f202397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f202398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<h> f202399d;

    static {
        new a(null);
    }

    public /* synthetic */ g(b bVar, List list, t tVar, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : tVar, (i14 & 8) != 0 ? null : list2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    public final List<f> a() {
        String startGMT;
        int i14;
        Integer pushes;
        int iIntValue;
        List<f> list = this.f202397b;
        if (list == null || list.isEmpty()) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        f fVar = (f) h0.b0(list);
        DateTime dateTimeN = c22.j0.N(fVar.getStartGMT(), true);
        b bVar = this.f202396a;
        DateTime dateTimeN2 = c22.j0.N(bVar != null ? bVar.getStartTimeGmt() : null, true);
        if (dateTimeN != null && dateTimeN2 != null) {
            int minutes = Minutes.minutesBetween(dateTimeN2, dateTimeN).getMinutes();
            if (-5 > minutes || minutes >= 5) {
                startGMT = fVar.getEndGMT();
            }
            i14 = 0;
            for (f fVar2 : list) {
                pushes = fVar2.getPushes();
                if (pushes != null) {
                    iIntValue = pushes.intValue();
                } else {
                    iIntValue = 0;
                }
                i14 += iIntValue;
                arrayList.add(f.b(fVar2, startGMT, fVar2.getStartGMT(), Integer.valueOf(i14)));
            }
            return arrayList;
        }
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.a(a2.ACTIVITIES, "PushesDetails.isFromStartOfDay: dates are null: " + dateTimeN + " | " + dateTimeN2 + ". Return default 'true'.");
        startGMT = fVar.getStartGMT();
        i14 = 0;
        while (r0.hasNext()) {
            pushes = fVar2.getPushes();
            if (pushes != null) {
                iIntValue = pushes.intValue();
            } else {
                iIntValue = 0;
            }
            i14 += iIntValue;
            arrayList.add(f.b(fVar2, startGMT, fVar2.getStartGMT(), Integer.valueOf(i14)));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f202396a, gVar.f202396a) && s.g(this.f202397b, gVar.f202397b) && s.g(this.f202398c, gVar.f202398c) && s.g(this.f202399d, gVar.f202399d);
    }

    public final int hashCode() {
        b bVar = this.f202396a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        List<f> list = this.f202397b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        t tVar = this.f202398c;
        int iHashCode3 = (iHashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<h> list2 = this.f202399d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "PushesDetails(dailyPushesDTO=" + this.f202396a + ", dailyChartDataDTO=" + this.f202397b + ", dailyTimelineDTO=" + this.f202398c + ", personalRecordsData=" + this.f202399d + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz42/g$a;", "", "<init>", "()V", "", "POSITIVE_TOLERANCE_IN_MINUTES", "I", "NEGATIVE_TOLERANCE_IN_MINUTES", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public g(b bVar, List<f> list, t tVar, List<h> list2) {
        this.f202396a = bVar;
        this.f202397b = list;
        this.f202398c = tVar;
        this.f202399d = list2;
    }

    public g() {
        this(null, null, null, null, 15, null);
    }
}
