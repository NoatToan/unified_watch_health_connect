package wd2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwd2/j;", "", "", "", "recipientSessionIds", "", "messageId", "messageText", "timestamp", "<init>", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f184506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f184507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f184509d;

    public j(List<String> list, Long l14, String str, Long l15) {
        this.f184506a = list;
        this.f184507b = l14;
        this.f184508c = str;
        this.f184509d = l15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f184506a, jVar.f184506a) && p005kotlin.jvm.internal.s.g(this.f184507b, jVar.f184507b) && p005kotlin.jvm.internal.s.g(this.f184508c, jVar.f184508c) && p005kotlin.jvm.internal.s.g(this.f184509d, jVar.f184509d);
    }

    public final int hashCode() {
        List<String> list = this.f184506a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l14 = this.f184507b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f184508c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.f184509d;
        return iHashCode3 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        return "GrouptrackMessage(recipientSessionIds=" + this.f184506a + ", messageId=" + this.f184507b + ", messageText=" + this.f184508c + ", timestamp=" + this.f184509d + ")";
    }
}
