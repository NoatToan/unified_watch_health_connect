package fg0;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfg0/l;", "", "Lfg0/e;", "event", "", "imageUrl", "Lh42/a;", "weather", "<init>", "(Lfg0/e;Ljava/lang/String;Lh42/a;)V", "a", "Lfg0/e;", "()Lfg0/e;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Lh42/a;", "()Lh42/a;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("event")
    private final e event;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weather")
    private final h42.a weather;

    public /* synthetic */ l(e eVar, String str, h42.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(eVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : aVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h42.a getWeather() {
        return this.weather;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.event, lVar.event) && p005kotlin.jvm.internal.s.g(this.imageUrl, lVar.imageUrl) && p005kotlin.jvm.internal.s.g(this.weather, lVar.weather);
    }

    public final int hashCode() {
        int iHashCode = this.event.hashCode() * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        h42.a aVar = this.weather;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "EventDataItem(event=" + this.event + ", imageUrl=" + this.imageUrl + ", weather=" + this.weather + ")";
    }

    public l(e eVar, String str, h42.a aVar) {
        eVar.getClass();
        this.event = eVar;
        this.imageUrl = str;
        this.weather = aVar;
    }
}
