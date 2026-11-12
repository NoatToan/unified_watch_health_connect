package ls;

import com.garmin.android.apps.connectmobile.activities.newmodel.e0;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lls/b;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e0;", "speedDisplayMeasureUnit", "", "data", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/newmodel/e0;Ljava/lang/Double;)V", "a", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e0;", "b", "()Lcom/garmin/android/apps/connectmobile/activities/newmodel/e0;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speedDisplayMeasureUnit")
    private final e0 speedDisplayMeasureUnit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speed")
    private final Double data;

    public b(e0 e0Var, Double d14) {
        e0Var.getClass();
        this.speedDisplayMeasureUnit = e0Var;
        this.data = d14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e0 getSpeedDisplayMeasureUnit() {
        return this.speedDisplayMeasureUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.speedDisplayMeasureUnit == bVar.speedDisplayMeasureUnit && s.g(this.data, bVar.data);
    }

    public final int hashCode() {
        int iHashCode = this.speedDisplayMeasureUnit.hashCode() * 31;
        Double d14 = this.data;
        return iHashCode + (d14 == null ? 0 : d14.hashCode());
    }

    public final String toString() {
        return "AviationSpeedData(speedDisplayMeasureUnit=" + this.speedDisplayMeasureUnit + ", data=" + this.data + ")";
    }
}
