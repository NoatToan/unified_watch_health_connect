package yi2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013Bq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lyi2/i;", "", "", "title", "organizer", "description", FirebaseAnalytics.Param.LOCATION, "", TtmlNode.START, TtmlNode.END, "", "allDay", "eventId", "calendarId", "", "Lyi2/n;", "attendees", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V", "a", "calendar-os_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class i implements Comparable<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f197400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f197401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f197402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f197403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f197404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f197405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f197406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<n> f197407j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyi2/i$a;", "", "<init>", "()V", "calendar-os_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f197408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f197409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f197410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f197411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f197412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f197413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Boolean f197414g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Long f197415h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Long f197416i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ArrayList f197417j;
    }

    public i(String str, String str2, String str3, String str4, Long l14, Long l15, Boolean bool, Long l16, Long l17, List<n> list) {
        this.f197398a = str;
        this.f197399b = str2;
        this.f197400c = str3;
        this.f197401d = str4;
        this.f197402e = l14;
        this.f197403f = l15;
        this.f197404g = bool;
        this.f197405h = l16;
        this.f197406i = l17;
        this.f197407j = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        i iVar2 = iVar;
        iVar2.getClass();
        Long l14 = iVar2.f197402e;
        Long l15 = this.f197402e;
        if (l15 == null) {
            return l14 == null ? 0 : 1;
        }
        if (l14 == null) {
            return -1;
        }
        return s.i(l15.longValue(), l14.longValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f197398a, iVar.f197398a) && s.g(this.f197399b, iVar.f197399b) && s.g(this.f197400c, iVar.f197400c) && s.g(this.f197401d, iVar.f197401d) && s.g(this.f197402e, iVar.f197402e) && s.g(this.f197403f, iVar.f197403f) && s.g(this.f197404g, iVar.f197404g) && s.g(this.f197405h, iVar.f197405h) && s.g(this.f197406i, iVar.f197406i) && s.g(this.f197407j, iVar.f197407j);
    }

    public final int hashCode() {
        String str = this.f197398a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f197399b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f197400c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f197401d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l14 = this.f197402e;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f197403f;
        int iHashCode6 = (iHashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Boolean bool = this.f197404g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l16 = this.f197405h;
        int iHashCode8 = (iHashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f197406i;
        int iHashCode9 = (iHashCode8 + (l17 == null ? 0 : l17.hashCode())) * 31;
        List<n> list = this.f197407j;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CalendarEvent(title=");
        sb3.append(this.f197398a);
        sb3.append(", organizer=");
        sb3.append(this.f197399b);
        sb3.append(", description=");
        sb3.append(this.f197400c);
        sb3.append(", location=");
        sb3.append(this.f197401d);
        sb3.append(", start=");
        sb3.append(this.f197402e);
        sb3.append(", end=");
        sb3.append(this.f197403f);
        sb3.append(", allDay=");
        sb3.append(this.f197404g);
        sb3.append(", eventId=");
        sb3.append(this.f197405h);
        sb3.append(", calendarId=");
        sb3.append(this.f197406i);
        sb3.append(", attendees=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f197407j, sb3);
    }
}
