package jx;

import gs1.e;
import gs1.t;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.y;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljx/a;", "", "Lgs1/t;", "timeline", "Lorg/joda/time/DateTime;", "startDateTime", "", "Lgs1/e$a;", "values", "<init>", "(Lgs1/t;Lorg/joda/time/DateTime;Ljava/util/List;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f101384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f101385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e.a> f101386c;

    public a(t tVar, DateTime dateTime, List list, int i14, j jVar) {
        e allDayStressDTO;
        e.c payload;
        e allDayStressDTO2;
        e.c payload2;
        tVar = (i14 & 1) != 0 ? null : tVar;
        dateTime = (i14 & 2) != 0 ? (tVar == null || (allDayStressDTO2 = tVar.getAllDayStressDTO()) == null || (payload2 = allDayStressDTO2.getPayload()) == null) ? null : payload2.f() : dateTime;
        if ((i14 & 4) != 0) {
            if (tVar == null || (allDayStressDTO = tVar.getAllDayStressDTO()) == null || (payload = allDayStressDTO.getPayload()) == null) {
                list = null;
            } else {
                ArrayList<e.a> arrayListB = payload.b();
                ArrayList arrayList = new ArrayList(y.r(arrayListB, 10));
                for (e.a aVar : arrayListB) {
                    DateTime dateTime2 = aVar.f78729a;
                    arrayList.add(new e.a(dateTime2 != null ? dateTime2.withZone(DateTimeZone.getDefault()) : null, aVar.f78730b, aVar.f78731c, aVar.f78732d));
                }
                list = arrayList;
            }
        }
        this(tVar, dateTime, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f101384a, aVar.f101384a) && s.g(this.f101385b, aVar.f101385b) && s.g(this.f101386c, aVar.f101386c);
    }

    public final int hashCode() {
        t tVar = this.f101384a;
        int iHashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        DateTime dateTime = this.f101385b;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        List<e.a> list = this.f101386c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BodyBatteryChartData(timeline=");
        sb3.append(this.f101384a);
        sb3.append(", startDateTime=");
        sb3.append(this.f101385b);
        sb3.append(", values=");
        return z.c(sb3, this.f101386c, ")");
    }

    public a(t tVar, DateTime dateTime, List<e.a> list) {
        this.f101384a = tVar;
        this.f101385b = dateTime;
        this.f101386c = list;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
