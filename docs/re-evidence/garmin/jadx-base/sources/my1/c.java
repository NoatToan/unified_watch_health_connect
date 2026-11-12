package my1;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmy1/c;", "", "", "eventFeelsLikeTemperature", "eventTemperature", "", "eventHumidity", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f121481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f121482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f121483c;

    public c(Double d14, Double d15, Integer num) {
        this.f121481a = d14;
        this.f121482b = d15;
        this.f121483c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f121481a, cVar.f121481a) && s.g(this.f121482b, cVar.f121482b) && s.g(this.f121483c, cVar.f121483c);
    }

    public final int hashCode() {
        Double d14 = this.f121481a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f121482b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num = this.f121483c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return f3.i(k.i("EventWeatherDetails(eventFeelsLikeTemperature=", this.f121481a, this.f121482b, ", eventTemperature=", ", eventHumidity="), this.f121483c, ")");
    }
}
