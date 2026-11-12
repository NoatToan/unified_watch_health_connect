package pl;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lpl/a;", "", "", "monitoringEnvironmentAltitudeDescIndex", "", "monitoringEnvironmentAltitudeDescKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monitoringEnvironmentAltitudeDescIndex")
    private final Integer monitoringEnvironmentAltitudeDescIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monitoringEnvironmentAltitudeDescKey")
    private final String monitoringEnvironmentAltitudeDescKey;

    public /* synthetic */ a(Integer num, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getMonitoringEnvironmentAltitudeDescIndex() {
        return this.monitoringEnvironmentAltitudeDescIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMonitoringEnvironmentAltitudeDescKey() {
        return this.monitoringEnvironmentAltitudeDescKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.monitoringEnvironmentAltitudeDescIndex, aVar.monitoringEnvironmentAltitudeDescIndex) && s.g(this.monitoringEnvironmentAltitudeDescKey, aVar.monitoringEnvironmentAltitudeDescKey);
    }

    public final int hashCode() {
        Integer num = this.monitoringEnvironmentAltitudeDescIndex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.monitoringEnvironmentAltitudeDescKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.f("MonitoringEnvironmentAltitudeDescriptorDTO(monitoringEnvironmentAltitudeDescIndex=", this.monitoringEnvironmentAltitudeDescIndex, ", monitoringEnvironmentAltitudeDescKey=", this.monitoringEnvironmentAltitudeDescKey, ")");
    }

    public a(Integer num, String str) {
        this.monitoringEnvironmentAltitudeDescIndex = num;
        this.monitoringEnvironmentAltitudeDescKey = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
