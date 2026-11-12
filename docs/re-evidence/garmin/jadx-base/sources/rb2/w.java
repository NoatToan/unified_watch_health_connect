package rb2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lrb2/w;", "", "Lrb2/w$b;", "sleep", "<init>", "(Lrb2/w$b;)V", "a", "b", "c", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class w implements vh.e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f151772a;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lrb2/w$a;", "", "", "awakeCount", "awakeSleepSeconds", "Lorg/joda/time/DateTime;", "calendarDate", "", "deviceRemCapable", "lightSleepSeconds", "deepSleepSeconds", "remSleepSeconds", "sleepTimeSeconds", "", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "sleepStartTimestampLocal", "sleepEndTimestampLocal", "sleepFromDevice", "", "sleepWindowConfirmationType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f151773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f151774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DateTime f151775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Boolean f151776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f151777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f151778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f151779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f151780h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Long f151781i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Long f151782j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Long f151783k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Long f151784l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Boolean f151785m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f151786n;

        public a(Integer num, Integer num2, DateTime dateTime, Boolean bool, Integer num3, Integer num4, Integer num5, Integer num6, Long l14, Long l15, Long l16, Long l17, Boolean bool2, String str) {
            this.f151773a = num;
            this.f151774b = num2;
            this.f151775c = dateTime;
            this.f151776d = bool;
            this.f151777e = num3;
            this.f151778f = num4;
            this.f151779g = num5;
            this.f151780h = num6;
            this.f151781i = l14;
            this.f151782j = l15;
            this.f151783k = l16;
            this.f151784l = l17;
            this.f151785m = bool2;
            this.f151786n = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f151773a, aVar.f151773a) && p005kotlin.jvm.internal.s.g(this.f151774b, aVar.f151774b) && p005kotlin.jvm.internal.s.g(this.f151775c, aVar.f151775c) && p005kotlin.jvm.internal.s.g(this.f151776d, aVar.f151776d) && p005kotlin.jvm.internal.s.g(this.f151777e, aVar.f151777e) && p005kotlin.jvm.internal.s.g(this.f151778f, aVar.f151778f) && p005kotlin.jvm.internal.s.g(this.f151779g, aVar.f151779g) && p005kotlin.jvm.internal.s.g(this.f151780h, aVar.f151780h) && p005kotlin.jvm.internal.s.g(this.f151781i, aVar.f151781i) && p005kotlin.jvm.internal.s.g(this.f151782j, aVar.f151782j) && p005kotlin.jvm.internal.s.g(this.f151783k, aVar.f151783k) && p005kotlin.jvm.internal.s.g(this.f151784l, aVar.f151784l) && p005kotlin.jvm.internal.s.g(this.f151785m, aVar.f151785m) && p005kotlin.jvm.internal.s.g(this.f151786n, aVar.f151786n);
        }

        public final int hashCode() {
            Integer num = this.f151773a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f151774b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            DateTime dateTime = this.f151775c;
            int iHashCode3 = (iHashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
            Boolean bool = this.f151776d;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num3 = this.f151777e;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f151778f;
            int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f151779g;
            int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.f151780h;
            int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Long l14 = this.f151781i;
            int iHashCode9 = (iHashCode8 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.f151782j;
            int iHashCode10 = (iHashCode9 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Long l16 = this.f151783k;
            int iHashCode11 = (iHashCode10 + (l16 == null ? 0 : l16.hashCode())) * 31;
            Long l17 = this.f151784l;
            int iHashCode12 = (iHashCode11 + (l17 == null ? 0 : l17.hashCode())) * 31;
            Boolean bool2 = this.f151785m;
            int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.f151786n;
            return iHashCode13 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("DailySleepDTO(awakeCount=");
            sb3.append(this.f151773a);
            sb3.append(", awakeSleepSeconds=");
            sb3.append(this.f151774b);
            sb3.append(", calendarDate=");
            sb3.append(this.f151775c);
            sb3.append(", deviceRemCapable=");
            sb3.append(this.f151776d);
            sb3.append(", lightSleepSeconds=");
            sb3.append(this.f151777e);
            sb3.append(", deepSleepSeconds=");
            sb3.append(this.f151778f);
            sb3.append(", remSleepSeconds=");
            sb3.append(this.f151779g);
            sb3.append(", sleepTimeSeconds=");
            sb3.append(this.f151780h);
            sb3.append(", sleepStartTimestampGMT=");
            sb3.append(this.f151781i);
            sb3.append(", sleepEndTimestampGMT=");
            sb3.append(this.f151782j);
            sb3.append(", sleepStartTimestampLocal=");
            sb3.append(this.f151783k);
            sb3.append(", sleepEndTimestampLocal=");
            sb3.append(this.f151784l);
            sb3.append(", sleepFromDevice=");
            sb3.append(this.f151785m);
            sb3.append(", sleepWindowConfirmationType=");
            return androidx.room.a0.m(sb3, this.f151786n, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrb2/w$b;", "", "Lrb2/w$a;", "dailySleepDTO", "", "Lrb2/w$c;", "sleepLevels", "<init>", "(Lrb2/w$a;Ljava/util/List;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f151787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<c> f151788b;

        public b(a aVar, List<c> list) {
            this.f151787a = aVar;
            this.f151788b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f151787a, bVar.f151787a) && p005kotlin.jvm.internal.s.g(this.f151788b, bVar.f151788b);
        }

        public final int hashCode() {
            a aVar = this.f151787a;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            List<c> list = this.f151788b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Sleep(dailySleepDTO=");
            sb3.append(this.f151787a);
            sb3.append(", sleepLevels=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f151788b, sb3);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrb2/w$c;", "", "Lorg/joda/time/LocalDateTime;", "startGMT", "endGMT", "", "activityLevel", "<init>", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/Double;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDateTime f151789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDateTime f151790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f151791c;

        public c(LocalDateTime localDateTime, LocalDateTime localDateTime2, Double d14) {
            this.f151789a = localDateTime;
            this.f151790b = localDateTime2;
            this.f151791c = d14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f151789a, cVar.f151789a) && p005kotlin.jvm.internal.s.g(this.f151790b, cVar.f151790b) && p005kotlin.jvm.internal.s.g(this.f151791c, cVar.f151791c);
        }

        public final int hashCode() {
            LocalDateTime localDateTime = this.f151789a;
            int iHashCode = (localDateTime == null ? 0 : localDateTime.hashCode()) * 31;
            LocalDateTime localDateTime2 = this.f151790b;
            int iHashCode2 = (iHashCode + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
            Double d14 = this.f151791c;
            return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
        }

        public final String toString() {
            return "SleepLevel(startGMT=" + this.f151789a + ", endGMT=" + this.f151790b + ", activityLevel=" + this.f151791c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public w(b bVar) {
        this.f151772a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && p005kotlin.jvm.internal.s.g(this.f151772a, ((w) obj).f151772a);
    }

    public final int hashCode() {
        b bVar = this.f151772a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "SleepFrag(sleep=" + this.f151772a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
