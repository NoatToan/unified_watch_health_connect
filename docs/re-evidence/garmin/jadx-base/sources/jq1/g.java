package jq1;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ljq1/g;", "", "Ljq1/b;", "dailyStepsDTO", "", "Ljq1/f;", "dailyChartDataDTO", "Lgs1/t;", "dailyTimelineDTO", "Ljq1/h;", "personalRecordsData", "<init>", "(Ljq1/b;Ljava/util/List;Lgs1/t;Ljava/util/List;)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100008e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f100009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<f> f100010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f100011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<h> f100012d;

    static {
        new a(null);
        f100008e = 8;
    }

    public /* synthetic */ g(b bVar, List list, t tVar, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : tVar, (i14 & 8) != 0 ? null : list2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    public final List<f> a() {
        String str;
        String str2;
        int i14;
        Integer num;
        int iIntValue;
        List<f> list = this.f100010b;
        if (list == null || list.isEmpty()) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        f fVar = (f) h0.b0(list);
        DateTime dateTimeN = c22.j0.N(fVar.f100002a, true);
        b bVar = this.f100009a;
        DateTime dateTimeN2 = c22.j0.N(bVar != null ? bVar.f99985g : null, true);
        if (dateTimeN != null && dateTimeN2 != null) {
            int minutes = Minutes.minutesBetween(dateTimeN2, dateTimeN).getMinutes();
            if (-5 > minutes || minutes >= 5) {
                str = fVar.f100003b;
            }
            str2 = str;
            i14 = 0;
            for (f fVar2 : list) {
                num = fVar2.f100004c;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                int i15 = i14 + iIntValue;
                arrayList.add(new f(str2, fVar2.f100002a, Integer.valueOf(i15), fVar2.f100005d, fVar2.f100006e));
                i14 = i15;
            }
            return arrayList;
        }
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.a(a2.ACTIVITIES, "StepsDetails.isFromStartOfDay: dates are null: " + dateTimeN + " | " + dateTimeN2 + ". Return default 'true'.");
        str = fVar.f100002a;
        str2 = str;
        i14 = 0;
        while (r0.hasNext()) {
            num = fVar2.f100004c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            int i16 = i14 + iIntValue;
            arrayList.add(new f(str2, fVar2.f100002a, Integer.valueOf(i16), fVar2.f100005d, fVar2.f100006e));
            i14 = i16;
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
        return s.g(this.f100009a, gVar.f100009a) && s.g(this.f100010b, gVar.f100010b) && s.g(this.f100011c, gVar.f100011c) && s.g(this.f100012d, gVar.f100012d);
    }

    public final int hashCode() {
        b bVar = this.f100009a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        List<f> list = this.f100010b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        t tVar = this.f100011c;
        int iHashCode3 = (iHashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<h> list2 = this.f100012d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "StepsDetails(dailyStepsDTO=" + this.f100009a + ", dailyChartDataDTO=" + this.f100010b + ", dailyTimelineDTO=" + this.f100011c + ", personalRecordsData=" + this.f100012d + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ljq1/g$a;", "", "<init>", "()V", "", "POSITIVE_TOLERANCE_IN_MINUTES", "I", "NEGATIVE_TOLERANCE_IN_MINUTES", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public g(b bVar, List<f> list, t tVar, List<h> list2) {
        this.f100009a = bVar;
        this.f100010b = list;
        this.f100011c = tVar;
        this.f100012d = list2;
    }

    public g() {
        this(null, null, null, null, 15, null);
    }
}
