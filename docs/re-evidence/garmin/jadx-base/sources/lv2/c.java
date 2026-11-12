package lv2;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llv2/c;", "", "", FirebaseAnalytics.Param.INDEX, "Ltv2/c;", "subtext", "", "darkColor", "lightColor", "<init>", "(Ljava/lang/Integer;Ltv2/c;Ljava/lang/Long;Ljava/lang/Long;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f115051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f115052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f115053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f115054d;

    public c(Integer num, tv2.c cVar, Long l14, Long l15) {
        cVar.getClass();
        this.f115051a = num;
        this.f115052b = cVar;
        this.f115053c = l14;
        this.f115054d = l15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f115051a, cVar.f115051a) && this.f115052b.equals(cVar.f115052b) && s.g(this.f115053c, cVar.f115053c) && s.g(this.f115054d, cVar.f115054d);
    }

    public final int hashCode() {
        Integer num = this.f115051a;
        int iL = g.l(this.f115052b, (num == null ? 0 : num.hashCode()) * 31, 31);
        Long l14 = this.f115053c;
        int iHashCode = (iL + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f115054d;
        return iHashCode + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        return "SelectionOptions(index=" + this.f115051a + ", subtext=" + this.f115052b + ", darkColor=" + this.f115053c + ", lightColor=" + this.f115054d + ")";
    }
}
