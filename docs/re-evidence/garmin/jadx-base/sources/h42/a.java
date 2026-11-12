package h42;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lh42/a;", "", "", "temperature", "", "iconId", "", "description", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/lang/String;", "()Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("temperature")
    private final Double temperature;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("iconId")
    private final Integer iconId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    public /* synthetic */ a(Double d14, Integer num, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getIconId() {
        return this.iconId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getTemperature() {
        return this.temperature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.temperature, aVar.temperature) && s.g(this.iconId, aVar.iconId) && s.g(this.description, aVar.description);
    }

    public final int hashCode() {
        Double d14 = this.temperature;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Integer num = this.iconId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.description;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.temperature;
        Integer num = this.iconId;
        String str = this.description;
        StringBuilder sb3 = new StringBuilder("EventWeather(temperature=");
        sb3.append(d14);
        sb3.append(", iconId=");
        sb3.append(num);
        sb3.append(", description=");
        return am.j.o(str, ")", sb3);
    }

    public a(Double d14, Integer num, String str) {
        this.temperature = d14;
        this.iconId = num;
        this.description = str;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
