package pl;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lpl/c;", "", "", "spo2AcclimationValueDescIndex", "", "spo2AcclimationValueDescKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2AcclimationValueDescIndex")
    private final Integer spo2AcclimationValueDescIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2AcclimationValueDescKey")
    private final String spo2AcclimationValueDescKey;

    public /* synthetic */ c(Integer num, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getSpo2AcclimationValueDescIndex() {
        return this.spo2AcclimationValueDescIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSpo2AcclimationValueDescKey() {
        return this.spo2AcclimationValueDescKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.spo2AcclimationValueDescIndex, cVar.spo2AcclimationValueDescIndex) && s.g(this.spo2AcclimationValueDescKey, cVar.spo2AcclimationValueDescKey);
    }

    public final int hashCode() {
        Integer num = this.spo2AcclimationValueDescIndex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.spo2AcclimationValueDescKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.f("Spo2AcclimationValueDescriptorDTO(spo2AcclimationValueDescIndex=", this.spo2AcclimationValueDescIndex, ", spo2AcclimationValueDescKey=", this.spo2AcclimationValueDescKey, ")");
    }

    public c(Integer num, String str) {
        this.spo2AcclimationValueDescIndex = num;
        this.spo2AcclimationValueDescKey = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
